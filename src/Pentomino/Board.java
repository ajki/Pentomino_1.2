package Pentomino;

import java.awt.Color;

import Pentomino.Interfaces.Control;

public class Board {
	Square[][] board;
	Square[][] shadowBoard;
	Pentomino livingPentomino;
	public Board(int gameWidth, int gameHeight){
		board = new Square[gameHeight][gameWidth];
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
	public Pentomino getLivingPentomino(){
		return livingPentomino;
	}
	public void setLivingPentominoDown(){
		
	}
	public void moveLivingPentominoOneTick(){
		if (livingPentomino==null) {
			livingPentomino = new Pentomino();
			System.out.println(board[1].length/2);
			livingPentomino.moveX(board[1].length/2);
			livingPentomino.moveY(-2);
			return;
		}
		
		livingPentomino.moveY(1);
		
		if (livingPentomino.below(board.length)) {
			livingPentomino = new Pentomino();
			livingPentomino.moveX(board[1].length/2);
			livingPentomino.moveY(-2);
			return;
		}
	}
	public void moveLivingPentomino(Control c) {
		if (c.isButtonPressed(Control.Buttons.Left) ){
			livingPentomino.moveX(-1);
		}
		if (c.isButtonPressed(Control.Buttons.Down) ){
			livingPentomino.moveY(1);
		}
		if (c.isButtonPressed(Control.Buttons.Right) ){
			livingPentomino.moveX(1);
		}
		
		
		
	}
	
}
