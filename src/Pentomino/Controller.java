package Pentomino;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Pentomino.Interfaces.Control;

public class Controller implements KeyListener,Control{
	
	
	protected boolean[] buttons = new boolean[Control.Buttons.values().length];
	public Controller(){
		
	}
	
	public void keyPressed(KeyEvent e){
		if (KeyEvent.getKeyText(e.getKeyCode()).equals(Configuration.left)){
			System.out.println("left pressed");
			
			buttons[Control.Buttons.Left.ordinal()]=true;
			
		}else if (KeyEvent.getKeyText(e.getKeyCode()).equals(Configuration.right)){
			
			buttons[Control.Buttons.Right.ordinal()]=true;
			System.out.println("right pressed");
		}else if (KeyEvent.getKeyText(e.getKeyCode()).equals(Configuration.rotate)){
			buttons[Control.Buttons.RotateLeft.ordinal()]=true;
			System.out.println("rotate pressed");
			
		}else if (KeyEvent.getKeyText(e.getKeyCode()).equals(Configuration.down)){
			buttons[Control.Buttons.Down.ordinal()]=true;
			System.out.println("down pressed");
		}else if (KeyEvent.getKeyText(e.getKeyCode()).equals(Configuration.pause)){
			buttons[Control.Buttons.Start.ordinal()]=true;
			System.out.println("pause pressed");
		}
	}
	
	public void keyReleased(KeyEvent e){
		if (KeyEvent.getKeyText(e.getKeyCode()).equals(Configuration.left)){
			System.out.println("left released");
			buttons[Control.Buttons.Left.ordinal()]=false;
		}else if (KeyEvent.getKeyText(e.getKeyCode()).equals(Configuration.right)){
			System.out.println("right released");
			buttons[Control.Buttons.Right.ordinal()]=false;
		}else if (KeyEvent.getKeyText(e.getKeyCode()).equals(Configuration.rotate)){
			System.out.println("rotate released");
			buttons[Control.Buttons.RotateLeft.ordinal()]=false;
		}else if (KeyEvent.getKeyText(e.getKeyCode()).equals(Configuration.down)){
			System.out.println("down released");
			buttons[Control.Buttons.Down.ordinal()]=false;
		}else if (KeyEvent.getKeyText(e.getKeyCode()).equals(Configuration.pause)){
			System.out.println("pause released");
			buttons[Control.Buttons.Start.ordinal()]=false;
		}
	}

	public void keyTyped(KeyEvent e) {
		
	}

	public boolean isUpPressed() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isDownPressed() {
		
		return buttons[Control.Buttons.Down.ordinal()];
	}

	public boolean isLeftPressed() {
		
		return buttons[Control.Buttons.Left.ordinal()]=false;
	}

	public boolean isRightPressed() {
		
		return buttons[Control.Buttons.Right.ordinal()]=false;
	}

	public boolean isStartPressed() {
		
		return buttons[Control.Buttons.Start.ordinal()];
	}

	public boolean isRotateRightPressed() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isRotateLeftPressed() {
		
		return buttons[Control.Buttons.RotateLeft.ordinal()];
	}
	
	
	
}
