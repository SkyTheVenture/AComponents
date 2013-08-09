package vapourtech.acomponents;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class APanel {
  
	/**
	 * DO NOT CHANGE ANY CODE
	 * DO NOT CALL THESE METHODS:
	 * setParent(AWindow)
	 * getNewID()
	 * OTHERWISE IT'S FINE

	 * AComponent Created by Aero and Creepers
	 * (Removing this comment is fine!)
	 */
	
	private AComponent[] components = new AComponent[0];
	AWindow parent = null;
	
	public void setParent(AWindow a){
		this.parent = a;
	}
	
	public void addComponent(AComponent a){
		a.setID(getNewID());
		AComponent[] b = new AComponent[components.length+1];
		for (int c = 0; c < components.length; c++){
			b[c] = components[c];
		}
		b[b.length-1] = a;
		this.components = b;
	}
	
	public void callEvent(MouseEvent b){
		for (AComponent a : components){
			if (a.mouseListen){
				a.onMouseEvent(b);
			}
		}
	}
	
	public void callEvent(KeyEvent b){
		for (AComponent a : components){
			if (a.keyListen){
				a.onKeyEvent(b);
			}
		}
	}
	
	private int getNewID() {
		int a = 1 + (int)(Math.random() * (((Integer.MAX_VALUE-1) - 1) + 1));
		for (AComponent b : components){
			if (b.getID() == a){
				return getNewID();
			}
		}
		return a;
	}

	public void removeComponent(int id){
		for (AComponent a : components){
			if (a.getID() == id){
				AComponent[] b = new AComponent[components.length-1];
				int index = 0;
				for (int c = 0; c < components.length; c++){
					if (!(a.getID() == id)){
						b[index] = components[c];
						index=index+1;
					}
				}
			}
		}
	}
	
	public void removeComponent(AComponent comp){
		for (AComponent a : components){
			if (a == comp){
				AComponent[] b = new AComponent[components.length-1];
				int index = 0;
				for (int c = 0; c < components.length; c++){
					if (!(a == comp)){
						b[index] = components[c];
						index=index+1;
					}
				}
			}
		}
	}

}
