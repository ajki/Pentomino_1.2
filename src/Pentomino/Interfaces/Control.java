package Pentomino.Interfaces;

public interface Control {
		public enum Buttons{
			Up,Left,Right,Down,Select,Start,RotateRight,RotateLeft
		}
		
		
		public boolean isButtonPressed(Buttons b);
}
