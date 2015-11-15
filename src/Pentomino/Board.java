package Pentomino;

import Pentomino.Interfaces.Control;

public class Board {
	Square[][] board;
	Square[][] shadowBoard;
	Pentomino livingPentomino;
	public Board(int gameWidth, int gameHeight){
		board = new Square[gameWidth][gameHeight];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j]=new Square(i, j);
			}
		}
	}
	
	public void checkForFullLines(){
		
	}
	public int removeFullLines(){
		return 0;
	}
	public Square[][] getFullBoard(){
		return board;
	}
	public void setLivingPentominoDown(){
		
	}
	public void moveLivingPentominoOneTick(){
		
	}
	public void moveLivingPentomino(Control c) {
		
		
	}
	
}
