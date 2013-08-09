package vapourtech.acomponents;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

public class ACanvas extends Canvas implements Runnable {
  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean running = false;
	private AWindow window = null;
	private Thread thread = null;
	
	public ACanvas(AWindow a){
		this.window = a;
	}
	
	public void stop(String string){
		if (!running){
			return;
		}
		running = false;
		try{
			thread.join();
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public void start(){
		if (running){
			return;
		}
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		long lastTime = System.nanoTime();
		final double amountOfTicks = window.fps;
		double ns = 1000000000/amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		while (running){
			long now = System.nanoTime();
			delta+= (now - lastTime)/ns;
			lastTime = now;
			if (delta >= 1){
				render();
				delta--;
			}
			if (System.currentTimeMillis() - timer > 1000){
				timer += 1000;
			}
		}
	}

	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null){
			createBufferStrategy(3);
			return;
		}
		Graphics s = bs.getDrawGraphics();
		Graphics2D g = (Graphics2D)s;
		for (APanel a : this.window.panels){
			for (AComponent b : a.components){
				b.draw(g);
			}
		}
	}

}
