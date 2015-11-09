package Pentomino;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener{
	
	PentominoMain game;
	public boolean left, right, rotate, down, pause;
	
	public Controller(PentominoMain game){
		this.game=game;
	}
	
	public void keyPressed(KeyEvent e){
		if (KeyEvent.getKeyText(e.getKeyCode()).equals(Configuration.left)){
			System.out.println("left pressed");
		}else if (KeyEvent.getKeyText(e.getKeyCode()).equals(Configuration.right)){
			System.out.println("right pressed");
		}else if (KeyEvent.getKeyText(e.getKeyCode()).equals(Configuration.rotate)){
			System.out.println("rotate pressed");
		}else if (KeyEvent.getKeyText(e.getKeyCode()).equals(Configuration.down)){
			System.out.println("down pressed");
		}else if (KeyEvent.getKeyText(e.getKeyCode()).equals(Configuration.pause)){
			System.out.println("pause pressed");
		}
	}
	
	public void keyReleased(KeyEvent e){
		if (KeyEvent.getKeyText(e.getKeyCode()).equals(Configuration.left)){
			System.out.println("left released");
		}else if (KeyEvent.getKeyText(e.getKeyCode()).equals(Configuration.right)){
			System.out.println("right released");
		}else if (KeyEvent.getKeyText(e.getKeyCode()).equals(Configuration.rotate)){
			System.out.println("rotate released");
		}else if (KeyEvent.getKeyText(e.getKeyCode()).equals(Configuration.down)){
			System.out.println("down released");
		}else if (KeyEvent.getKeyText(e.getKeyCode()).equals(Configuration.pause)){
			System.out.println("pause released");
		}
	}

	public void keyTyped(KeyEvent e) {
		
	}
	
	
	
}
