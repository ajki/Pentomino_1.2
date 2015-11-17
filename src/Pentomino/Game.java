package Pentomino;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import Pentomino.Interfaces.ConfigurationInterface;
import Pentomino.Interfaces.Control;
import Pentomino.Interfaces.Display;
import Pentomino.Interfaces.TetrisGame;

public class Game implements TetrisGame{
	Control c;
	Display d;
	Board b;
	ConfigurationInterface CI;
	private Timer t1;
	private Timer t2;
   public Game(Control c, Display d,ConfigurationInterface CI){
	   this.c = c;
	   this.d = d;
	  
	   if (CI == null){
			createStandartConfigurationInterface();
			CI=this.CI;
		}else{this.CI=CI;}
	   b = new Board(CI.getBoardWidth(), CI.GetBoardHeight());
	   b.board[0][2].setC(Color.CYAN);
	   b.board[4][11].setC(Color.green);
	   b.board[0][4].setC(Color.BLUE);
	   b.board[2][2].setC(Color.RED);
	   d.setData(b);
   }

public void start() {
	
	t1 = new javax.swing.Timer(CI.getSpeedOfStep(), new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.out.println("tick");
			
			b.moveLivingPentominoOneTick();
			if (Collision()){
				b.moveLivingPentomino(-1,0);
				b.setLivingPentominoDown();
				b.removeFullLines(b.checkForFullLines());
			}
			d.refresh();
		}
	});
	 t2 = new javax.swing.Timer(CI.getSpeedOfControl(), new ActionListener() {	
		public void actionPerformed(ActionEvent e) {
			MoveControl(c);
			if (Collision()){
				b.moveLivingPentomino(c,true);
			}
			d.refresh();
		}
	});
	t1.start();
	t2.start();
	
}


private void createStandartConfigurationInterface() {
	CI = new ConfigurationInterface() {
		int sc = 1000/50;
		int ss = 1000/10;
		public int getSpeedOfControl() {
			return sc;
		}

		public int getSpeedOfStep() {
			
			return ss;
		}

		public void setSpeedOfControl(int s) {
			sc = s;
			t1.setDelay(s);
		}

		public void setSpeedOfStep(int s) {
			ss = s;
			t2.setDelay(s);
			
		}

		public int getBoardWidth() {
			
			return 12;
		}

		public int GetBoardHeight() {
			
			return 36;
		}
	};
	
}
public void MoveControl(Control c) {
	b.moveLivingPentomino(c,false);
	
}

public void MoveTime() {
	b.moveLivingPentominoOneTick();
	
}
public boolean Collision() {
	Pentomino p = b.getLivingPentomino();
	if (p==null)return false;
	for (Square s : p.getSquares()) {
		Square[][] ss =b.board;
		int y =s.getY();
		int x =s.getX();
		if (y<0)continue;
		if (y>=ss.length)return true;
		if (x<0) return true;
		if (x>=ss[0].length)return true;
		if(!ss[s.getY()][s.getX()].getC().equals(Color.BLUE)){
			return true;
		}
		
	}
	return false;
}
public boolean PlacePiece() {
	// TODO Auto-generated method stub
	return false;
}
public void NextPiece() {
	// TODO Auto-generated method stub
	
}
public void UpdateScore() {
	// TODO Auto-generated method stub
	
}
public long getScore() {
	// TODO Auto-generated method stub
	return 0;
}

}
