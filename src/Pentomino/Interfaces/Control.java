package Pentomino.Interfaces;

public interface Control {
		public enum Buttons{
			Up,Left,Right,Down,Select,Start,RotateRight,RotateLeft
		}
		public boolean isUpPressed();
		public boolean isDownPressed();
		public boolean isLeftPressed();
		public boolean isRightPressed();
		public boolean isStartPressed();
		public boolean isRotateRightPressed();
		public boolean isRotateLeftPressed();
}
