package vapourtech.acomponents;

import javax.swing.JFrame;

public class AWindow extends JFrame{
  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private ACanvas can;
	
	int fps = 60;
	APanel[] panels = new APanel[0];
	
	public AWindow(){
		frame = new JFrame();
	}
	
	public void setMaxFPS(int a){
		if (a > 0){
			this.fps = a;
		}
	}
	
	public AWindow(String title){
		this();
		setTitle(title);
	}
	
	public void setTitle(String title){
		frame.setTitle(title);
	}
	
	public void setVisible(boolean visible){
		if (visible){
			can = new ACanvas(this);
		}
		frame.add(can);
		frame.setVisible(visible);
		can.start();
	}
	
	public void addPanel(APanel a){
		APanel[] b = new APanel[panels.length+1];
		for (int c = 0; c < panels.length; c++){
			b[c] = panels[c];
		}
		b[b.length-1] = a;
		panels = b;
	}
	
	public void removePanel(APanel a){
		for (APanel b : panels){
			if (b == a){
				APanel[] d = new APanel[panels.length-1];
				int index = 0;
				for (int c = 0; c < panels.length; c++){
					if (!(a == b)){
						d[index] = panels[c];
						index=index+1;
					}
				}
			}
		}
	}
	
}
