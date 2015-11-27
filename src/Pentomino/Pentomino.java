package Pentomino;

import java.awt.Color;
import java.awt.List;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Random;

import Pentomino.Interfaces.PentominoInterface;
	
	/** A pentomino contains of 5 Squares.
	 * @see Square
	 * You can move this pentomino arround with the method moveX and moveY by that the coordinates of the according squares will
	 * be updated.
	 * 
	 * @author Markus
	 * @author Emil
	 */
	public class Pentomino implements PentominoInterface
	{
		ArrayList<Square> squares = new ArrayList<Square>();
		String name = "";
		int index = 0;
		//TODO rename all the arrays so that they can somehow be chosen.
		
		//
		protected Square[] pa0= {Square(0,1),Square(1,1),Square(0,0),Square(1,0),Square(0,-1)};
		protected Square[] pa1= {Square(-1,0),Square(0,0),Square(1,0),Square(0,-1),Square(1,-1)};
		protected Square[] pa2= {Square(0,1),Square(-1,0),Square(0,0),Square(-1,-1),Square(0,-1)};
		protected Square[] pa3= {Square(-1,1),Square(0,1),Square(-1,0),Square(0,0),Square(1,0)};
		
		protected Square[] pb0= {Square(-1,1),Square(0,1),Square(-1,0),Square(0,0),Square(0,-1)};
		protected Square[] pb1= {Square(0,1),Square(1,1),Square(-1,0),Square(0,0),Square(1,0)};
		protected Square[] pb2= {Square(0,1),Square(0,0),Square(1,0),Square(0,-1),Square(1,-1)};
		protected Square[] pb3= {Square(-1,0),Square(0,0),Square(1,0),Square(-1,-1),Square(0,-1)};
		
		protected Square[] xa0= {Square(0,1),Square(-1,0),Square(0,0),Square(1,0),Square(0,-1)};
		
		protected Square[] ua0= {Square(0,1),Square(1,1),Square(0,0),Square(0,-1),Square(1,-1)};
		protected Square[] ua1= {Square(-1,0),Square(0,0),Square(1,0),Square(-1,-1),Square(1,-1)};
		protected Square[] ua2= {Square(-1,1),Square(0,1),Square(0,0),Square(-1,-1),Square(0,-1)};
		protected Square[] ua3= {Square(-1,1),Square(1,1),Square(-1,0),Square(0,0),Square(1,0)};
		
		protected Square[] za0= {Square(-1,1),Square(0,1),Square(0,0),Square(0,-1),Square(1,-1)};
		protected Square[] za1= {Square(1,1),Square(-1,0),Square(0,0),Square(1,0),Square(-1,-1)};
		
		protected Square[] zb0= {Square(0,1),Square(1,1),Square(0,0),Square(-1,-1),Square(0,-1)};
		protected Square[] zb1= {Square(-1,1),Square(-1,0),Square(0,0),Square(1,0),Square(1,-1)};
		
		protected Square[] ia0= {Square(0,2),Square(0,1),Square(0,0),Square(0,-1),Square(0,-2)};
		protected Square[] ia1= {Square(-2,0),Square(-1,0),Square(0,0),Square(1,0),Square(2,0)};
		
		protected Square[] ta0= {Square(-1,0),Square(0,0),Square(1,0),Square(0,-1),Square(0,-2)};
		protected Square[] ta1= {Square(0,1),Square(-2,0),Square(-1,0),Square(0,0),Square(0,-1)};
		protected Square[] ta2= {Square(0,2),Square(0,1),Square(-1,0),Square(0,0),Square(1,0)};
		protected Square[] ta3= {Square(0,1),Square(0,0),Square(1,0),Square(2,0),Square(0,-1)};
		
		protected Square[] va0= {Square(0,2),Square(0,1),Square(0,0),Square(1,0),Square(2,0)};
		protected Square[] va1= {Square(0,0),Square(1,0),Square(2,0),Square(0,-1),Square(0,-2)};
		protected Square[] va2= {Square(-2,0),Square(-1,0),Square(0,0),Square(0,-1),Square(0,-2)};
		protected Square[] va3= {Square(0,2),Square(0,1),Square(-2,0),Square(-1,0),Square(0,0)};
		
		protected Square[] wa0= {Square(-1,1),Square(-1,0),Square(0,0),Square(0,-1),Square(1,-1)};
		protected Square[] wa1= {Square(0,1),Square(1,1),Square(-1,0),Square(0,0),Square(-1,-1)};
		protected Square[] wa2= {Square(-1,1),Square(0,1),Square(0,0),Square(1,0),Square(1,-1)};
		protected Square[] wa3= {Square(1,1),Square(0,0),Square(1,0),Square(-1,-1),Square(0,-1)};
		
		protected Square[] ya0= {Square(0,1),Square(-1,0),Square(0,0),Square(0,-1),Square(0,-2)};
		protected Square[] ya1= {Square(0,1),Square(-2,0),Square(-1,0),Square(0,0),Square(1,0)};
		protected Square[] ya2= {Square(0,2),Square(0,1),Square(0,0),Square(1,0),Square(0,-1)};
		protected Square[] ya3= {Square(-1,0),Square(0,0),Square(1,0),Square(2,0),Square(0,-1)};
		
		protected Square[] yb0= {Square(0,1),Square(0,0),Square(1,0),Square(0,-1),Square(0,-2)};
		protected Square[] yb1= {Square(-2,0),Square(-1,0),Square(0,0),Square(1,0),Square(0,-1)};
		protected Square[] yb2= {Square(0,2),Square(0,1),Square(-1,0),Square(0,0),Square(0,-1)};
		protected Square[] yb3= {Square(0,1),Square(-1,0),Square(0,0),Square(1,0),Square(2,0)};
		
		protected Square[] na0= {Square(-1,1),Square(-1,0),Square(0,0),Square(0,-1),Square(0,-2)};
		protected Square[] na1= {Square(0,1),Square(1,1),Square(-2,0),Square(-1,0),Square(0,0)};
		protected Square[] na2= {Square(0,2),Square(0,1),Square(0,0),Square(1,0),Square(1,-1)};
		protected Square[] na3= {Square(0,0),Square(1,0),Square(2,0),Square(-1,-1),Square(0,-1)};
		
		protected Square[] nb0= {Square(1,1),Square(0,0),Square(1,0),Square(0,-1),Square(0,-2)};
		protected Square[] nb1= {Square(-2,0),Square(-1,0),Square(0,0),Square(0,-1),Square(1,-1)};
		protected Square[] nb2= {Square(0,2),Square(0,1),Square(-1,0),Square(0,0),Square(-1,-1)};
		protected Square[] nb3= {Square(-1,1),Square(0,1),Square(0,0),Square(1,0),Square(2,0)};
		
		protected Square[] fa0= {Square(0,1),Square(1,1),Square(-1,0),Square(0,0),Square(0,-1)};
		protected Square[] fa1= {Square(0,1),Square(-1,0),Square(0,0),Square(1,0),Square(1,-1)};
		protected Square[] fa2= {Square(0,1),Square(0,0),Square(1,0),Square(-1,-1),Square(0,-1)};
		protected Square[] fa3= {Square(-1,1),Square(-1,0),Square(0,0),Square(1,0),Square(0,-1)};
		
		protected Square[] fb0= {Square(-1,1),Square(0,1),Square(0,0),Square(1,0),Square(0,-1)};
		protected Square[] fb1= {Square(1,1),Square(-1,0),Square(0,0),Square(1,0),Square(0,-1)};
		protected Square[] fb2= {Square(0,1),Square(-1,0),Square(0,0),Square(0,-1),Square(1,-1)};
		protected Square[] fb3= {Square(0,1),Square(-1,0),Square(0,0),Square(1,0),Square(-1,-1)};
		
		protected Square[] la0= {Square(0,3),Square(0,2),Square(0,1),Square(0,0),Square(1,0)};
		protected Square[] la1= {Square(0,0),Square(1,0),Square(2,0),Square(3,0),Square(0,-1)};
		protected Square[] la2= {Square(-1,0),Square(0,0),Square(0,-1),Square(0,-2),Square(0,-3)};
		protected Square[] la3= {Square(0,1),Square(-3,0),Square(-2,0),Square(-1,0),Square(0,0)};
		
		protected Square[] lb0= {Square(0,3),Square(0,2),Square(0,1),Square(0,0),Square(-1,0)};
		protected Square[] lb1= {Square(0,1),Square(0,0),Square(1,0),Square(2,0),Square(3,0)};
		protected Square[] lb2= {Square(0,0),Square(1,0),Square(0,-1),Square(0,-2),Square(0,-3)};
		protected Square[] lb3= {Square(-3,0),Square(-2,0),Square(-1,0),Square(0,0),Square(0,-1)};
		ArrayList<Square[]> pentomino= loadPentominosIntoArray();//new ArrayList<Square[]>();
		ArrayList<String> pentominoNames= loadPentominosNamesIntoArray();
		
		
		public Square Square(int j, int k) {
			Square a=new Square(j,k);
			return a;
		}
		
		public Pentomino() {
			//TODO modify the constructor that a random pentomino gets choosen. Depending on the chosen pentomino, a different color should be used
			loadPentominosIntoArray();
			Random r = new Random();
			index = r.nextInt(pentomino.size());
			
				//f = this.getClass().getField("la1");
			for (int x = 0; x< pentominoNames.size();x++) {
				if (pentominoNames.get(x).equals("ta1")) index = x;
			}
			this.name = pentominoNames.get(index);
			System.out.println(name);
			boolean rainbow = false;
			Color c = ColorE.colorM();
			Square s = new Square(3,2); 
			Square[] newPiece = copyPentomino(pentomino.get(index));
			
			
			for (Square square : newPiece) {
				if (rainbow)square.setC(ColorE.colorM());else square.setC(c);
			}
			squares.add(newPiece[0]);
			squares.add(newPiece[1]);
			squares.add(newPiece[2]);
			squares.add(newPiece[3]);
			squares.add(newPiece[4]);
			
		}
		

	

		private Square[] copyPentomino(
				Square[] squares) {
			Square[] newPiece = new Square[5];
			newPiece[0] = squares[0].copy();
			newPiece[1] = squares[1].copy();
			newPiece[2] = squares[2].copy();
			newPiece[3] = squares[3].copy();
			newPiece[4] = squares[4].copy();
			return newPiece;
		}

		private  ArrayList<String> loadPentominosNamesIntoArray() {
			ArrayList<String> pentomino= new ArrayList<String>(80);
			pentomino.add("pa0");
			pentomino.add("pa1");
			pentomino.add("pa2");
			pentomino.add("pa3");
			
			pentomino.add("pb0");
			pentomino.add("pb1");
			pentomino.add("pb2");
			pentomino.add("pb3");
			
			pentomino.add("xa0");
			
			pentomino.add("ua0");
			pentomino.add("ua1");
			pentomino.add("ua2");
			pentomino.add("ua3");
			
			pentomino.add("za0");
			pentomino.add("za1");
			
			pentomino.add("zb0");
			pentomino.add("zb1");
			
			pentomino.add("ia0");
			pentomino.add("ia1");
			
			pentomino.add("ta0");
			pentomino.add("ta1");
			pentomino.add("ta2");
			pentomino.add("ta3");
			
			pentomino.add("va0");
			pentomino.add("va1");
			pentomino.add("va2");
			pentomino.add("va3");
			
			pentomino.add("wa0");
			pentomino.add("wa1");
			pentomino.add("wa2");
			pentomino.add("wa3");
			
			pentomino.add("ya0");
			pentomino.add("ya1");
			pentomino.add("ya2");
			pentomino.add("ya3");
			
			pentomino.add("yb0");
			pentomino.add("yb1");
			pentomino.add("yb2");
			pentomino.add("yb3");
			
			pentomino.add("na0");
			pentomino.add("na1");
			pentomino.add("na2");
			pentomino.add("na3");
			
			pentomino.add("nb0");
			pentomino.add("nb1");
			pentomino.add("nb2");
			pentomino.add("nb3");
			
			pentomino.add("fa0");
			pentomino.add("fa1");
			pentomino.add("fa2");
			pentomino.add("fa3");
			
			pentomino.add("fb0");
			pentomino.add("fb1");
			pentomino.add("fb2");
			pentomino.add("fb3");
			
			pentomino.add("la0");
			pentomino.add("la1");
			pentomino.add("la2");
			pentomino.add("la3");
			
			pentomino.add("lb0");
			pentomino.add("lb1");
			pentomino.add("lb2");
			pentomino.add("lb3");
			
			return pentomino;
			
		}
		private  ArrayList<Square[]> loadPentominosIntoArray() {
			ArrayList<Square[]> pentomino= new ArrayList<Square[]>(80);
			pentomino.add(pa0);
			pentomino.add(pa1);
			pentomino.add(pa2);
			pentomino.add(pa3);
			
			pentomino.add(pb0);
			pentomino.add(pb1);
			pentomino.add(pb2);
			pentomino.add(pb3);
			
			pentomino.add(xa0);
			
			pentomino.add(ua0);
			pentomino.add(ua1);
			pentomino.add(ua2);
			pentomino.add(ua3);
			
			pentomino.add(za0);
			pentomino.add(za1);
			
			pentomino.add(zb0);
			pentomino.add(zb1);
			
			pentomino.add(ia0);
			pentomino.add(ia1);
			
			pentomino.add(ta0);
			pentomino.add(ta1);
			pentomino.add(ta2);
			pentomino.add(ta3);
			
			pentomino.add(va0);
			pentomino.add(va1);
			pentomino.add(va2);
			pentomino.add(va3);
			
			pentomino.add(wa0);
			pentomino.add(wa1);
			pentomino.add(wa2);
			pentomino.add(wa3);
			
			pentomino.add(ya0);
			pentomino.add(ya1);
			pentomino.add(ya2);
			pentomino.add(ya3);
			
			pentomino.add(yb0);
			pentomino.add(yb1);
			pentomino.add(yb2);
			pentomino.add(yb3);
			
			pentomino.add(na0);
			pentomino.add(na1);
			pentomino.add(na2);
			pentomino.add(na3);
			
			
			pentomino.add(nb0);
			pentomino.add(nb1);
			pentomino.add(nb2);
			pentomino.add(nb3);
			
			pentomino.add(fa0);
			pentomino.add(fa1);
			pentomino.add(fa2);
			pentomino.add(fa3);
			
			pentomino.add(fb0);
			pentomino.add(fb1);
			pentomino.add(fb2);
			pentomino.add(fb3);
			
			pentomino.add(la0);
			pentomino.add(la1);
			pentomino.add(la2);
			pentomino.add(la3);
			
			pentomino.add(lb0);
			pentomino.add(lb1);
			pentomino.add(lb2);
			pentomino.add(lb3);
			
			return pentomino;
		}

		

		public Square[] getSquares() {
			
			return squares.toArray(new Square[squares.size()]);
		}

		public void rotate(boolean right) {
			System.out.println("rotate right" + right);
			int j = 0;
			if (right) j++;else j--;
			if (index+j>pentomino.size()) j-=4; //out of bounds
			if (index+j<0) j+=4; //out of bounds
			//findGoalPentomino
			String currentPentomino = name.substring(0, 2);
			if (currentPentomino.equals("xa"))return;
			
			String nextPentomino =  pentominoNames.get(index+j).substring(0, 2);
			int goalIndex = 0;
			if (nextPentomino.equals(currentPentomino)){//greatRotationPossible
				goalIndex = index+j;
			}else{
				if (currentPentomino.equals("ia")||currentPentomino.equals("za")||currentPentomino.equals("zb")){
					goalIndex = index-j;
				}else{
					goalIndex = index-3*j;
				}
			}
			String name =  pentominoNames.get(index);
			String name2 =  pentominoNames.get(goalIndex);
			
			
			for (int i = 0; i <5; i++){
				int newx = squares.get(i).getX();
				newx -= pentomino.get(index)[i].getX();
				newx += pentomino.get(goalIndex)[i].getX();
				
				int newy = squares.get(i).getY();
				newy -= pentomino.get(index)[i].getY();
				newy += pentomino.get(goalIndex)[i].getY();
				squares.get(i).setX(newx);
				squares.get(i).setY(newy);
			}
			
			this.index = goalIndex;
			this.name = pentominoNames.get(goalIndex);
		}
		
		public void moveX(int j) {
			for (Square s : squares) {
				s.setX(s.getX()+j);
			}
			
		}

		public void moveY(int j) {
			for (Square s : squares) {
				s.setY(s.getY()+j);
			}
			
		}

	public boolean below(int line) {
			
			int count = 0;
			for (Square s : squares) {
				if (s.getY()>line)count++;
				
			}
			if (count == squares.size())return true;
			return false;
		}
		
	}