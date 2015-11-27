package Pentomino;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

import Pentomino.Interfaces.Control;

public class Board {
	Square[][] board;
	Square[][] shadowBoard;
	Pentomino livingPentomino;
	Pentomino shadowPentomino;
	private boolean rotatePressed;
	public Board(int gameWidth, int gameHeight){
		board = new Square[gameHeight][gameWidth];
		shadowBoard = new Square[gameHeight][gameWidth];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j]=new Square(i, j);
			}
		}
		
	}
	
	public ArrayList<Integer> checkForFullLines(){
		ArrayList<Integer> fullLines = new ArrayList<Integer>();
		for (int i = 0;i<board.length;i++){
			int count = 0;
			for (int j = 0;j<board[1].length;j++){
				if (board[i][j].getC().getRGB()!=Color.BLUE.getRGB())count++;
			}
			if (count == board[1].length){
				fullLines.add(i);
			}
		}
		return fullLines;
	}
	public void removeFullLines(ArrayList<Integer> fullLines){
		for (Integer line : fullLines) {
			for (int x=0;x<board[line].length;x++){
				if (line==0)board[line][x] = new Square(board[line][x].getX(),board[line][x].getY());
				else{
					for (int y=line;y>0;y--){
						board[y][x] = board[y-1][x];
						board[y][x].setY(board[y][x].getY()+1);
					}
					board[0][x] = new Square(board[0][x].getX(),board[0][x].getY());
				}
				
				
			}
		}
		
	}
	public Square[][] getFullBoard(){
		return board;
	}
	public Pentomino getLivingPentomino(){
		return livingPentomino;
	}
	public void setLivingPentominoDown(){
		if (livingPentomino==null)return;
		if (!livingPentomino.below(-1)){System.out.println("endgame");}
		Square[] s = livingPentomino.getSquares();
		for (int i= 0;i<s.length;i++){
			Square ss = s[i];//singlesquare
			board[ss.getY()][ss.getX()]=ss;
		}
		livingPentomino=null;
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
	public void moveLivingPentomino(Control c, boolean reverseXY) {
		if (livingPentomino==null)return;
		
			if (c.isButtonPressed(Control.Buttons.RotateRight) && !rotatePressed){
				livingPentomino.rotate(true^reverseXY);
				rotatePressed=true;
			}
			if (c.isButtonPressed(Control.Buttons.RotateLeft)  && !rotatePressed){
				livingPentomino.rotate(false^reverseXY);
				rotatePressed=true;
			}
			if (!c.isButtonPressed(Control.Buttons.RotateLeft) && !c.isButtonPressed(Control.Buttons.RotateRight)) rotatePressed=false;
		if (!reverseXY){
		
		if (c.isButtonPressed(Control.Buttons.Left) ){
			livingPentomino.moveX(-1);
		}
		if (c.isButtonPressed(Control.Buttons.Down) ){
			livingPentomino.moveY(1);
		}
		if (c.isButtonPressed(Control.Buttons.Right) ){
			livingPentomino.moveX(1);
		}}else{
			if (c.isButtonPressed(Control.Buttons.Left) ){
				livingPentomino.moveX(1);
			}
			if (c.isButtonPressed(Control.Buttons.Down) ){
				livingPentomino.moveY(-1);
			}
			if (c.isButtonPressed(Control.Buttons.Right) ){
				livingPentomino.moveX(-1);
			}
		}
		
		
		
	}

	public void moveLivingPentomino(int y, int x) {
		if (livingPentomino==null)return;
		livingPentomino.moveX(x);
		livingPentomino.moveY(y);
		
	}

	public ArrayList<Square[][]> getFullBoardShadow() {
		//remember this ArrayList<Square>[][];
		 for (int i = 0; i < board.length; i++) {
			 shadowBoard[i] = Arrays.copyOf(board[i], board[i].length);
		 }
		 //maybeInverse here, for the 4d part....
		 
		 
		 
		Square[][] shadowBoard2 = new Square[board.length][board[0].length];
		 for (int j = 0; j < board.length; j++) {
			 shadowBoard2[j] = Arrays.copyOf(board[j], board[j].length);
			}
		 ArrayList<Square[][]> asd = new ArrayList<Square[][]>();
		 asd.add(shadowBoard);
		 asd.add(shadowBoard2);
		return asd;
	}

	public void setFullBoard(Square[][] extracted) {
		board = extracted;
		
	}
	
	
}
