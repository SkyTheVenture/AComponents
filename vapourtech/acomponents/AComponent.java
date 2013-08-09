package vapourtech.acomponents;

import java.awt.Graphics;

public class AComponent {
	
	/**
	 * DO NOT CHANGE ANY CODE
	 * DO NOT CALL THESE METHODS:
	 * setId(Integer)
	 * draw(Graphics)
	 * OTHERWISE IT'S FINE
	 * 
	 * AComponent Created by Aero
	 * (Removing this comment is fine!)
	 */
	
	private int id = 0;
	int x, y, width, height;
	public AComponent(){}
	public int getID(){ return id; }
	public void setID(int a){ this.id = a; }
	public void draw(Graphics g){}
	public void setX(int x){ this.x = x;  }
	public void setY(int y){ this.y = y; }
	public void setWidth(int width){ this.width = width; }
	public void setHeight(int height){ this.height = height; }
	
	

}
