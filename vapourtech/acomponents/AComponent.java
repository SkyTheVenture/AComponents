package vapourtech.acomponents;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class AComponent {
	
	/**
	 * DO NOT CHANGE ANY CODE
	 * DO NOT CALL THESE METHODS:
	 * setId(Integer)
	 * draw(Graphics)
	 * onMouseEvent(MouseEvent)
	 * OTHERWISE IT'S FINE
	 * AERO SUCKS!
	 * AComponent Created by Aero
	 * (Removing this comment is fine!)
	 */
	
	private int id = 0;
	private APanel parent = null;
	int x, y, width, height = 0;
	boolean mouseListen = false;
	MouseEvent mouseEvent = null;
	boolean keyListen = false;
	KeyEvent keyEvent = null;
	public AComponent(){}
	public int getID(){ return id; }
	public void setID(int a){ this.id = a; }
	public void draw(Graphics g){}
	public APanel getParent(){ return parent; }
	public void setX(int x){ this.x = x;  }
	public void setY(int y){ this.y = y; }
	public void setWidth(int width){ this.width = width; }
	public void setParent(APanel a){ this.parent = a; }
	public void setHeight(int height){ this.height = height; }
	public void registerMouseEvent(MouseEvent a){ mouseEvent = a; mouseListen = true; }
	public void onMouseEvent(MouseEvent a){}
	public void registerKeyEvent(KeyEvent a){ keyEvent = a; keyListen = true; }
	public void onMouseEvent(KeyEvent a){}

}
