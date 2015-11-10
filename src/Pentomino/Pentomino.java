package Pentomino;
	
	
	public class Pentomino 
	{
		protected Square[] pMain= {Square(0,1),Square(1,1),Square(0,0),Square(1,0),Square(0,-1)};
		protected Square[] pM1= {Square(-1,0),Square(0,0),Square(1,0),Square(0,-1),Square(1,-1)};
		protected Square[] pM2= {Square(0,1),Square(-1,0),Square(0,0),Square(-1,-1),Square(0,-1)};
		protected Square[] pM3= {Square(-1,1),Square(0,1),Square(-1,0),Square(0,0),Square(1,0)};
		
		protected Square[] pOther= {Square(-1,1),Square(0,1),Square(-1,0),Square(0,0),Square(0,-1)};
		protected Square[] pO1= {Square(0,1),Square(1,1),Square(-1,0),Square(0,0),Square(1,0)};
		protected Square[] pO2= {Square(0,1),Square(0,0),Square(1,0),Square(0,-1),Square(1,-1)};
		protected Square[] pO3= {Square(-1,0),Square(0,0),Square(1,0),Square(-1,-1),Square(0,-1)};
		
		protected Square[] x= {Square(0,1),Square(-1,0),Square(0,0),Square(1,0),Square(0,-1)};
		
		protected Square[] u= {Square(0,1),Square(1,1),Square(0,0),Square(0,-1),Square(1,-1)};
		protected Square[] u1= {Square(-1,0),Square(0,0),Square(1,0),Square(-1,-1),Square(1,-1)};
		protected Square[] u2= {Square(-1,1),Square(0,1),Square(0,0),Square(-1,-1),Square(0,-1)};
		protected Square[] u3= {Square(-1,1),Square(1,1),Square(-1,0),Square(0,0),Square(1,0)};
		
		protected Square[] zMain= {Square(-1,1),Square(0,1),Square(0,0),Square(0,-1),Square(1,-1)};
		protected Square[] zM2= {Square(1,1),Square(-1,0),Square(0,0),Square(1,0),Square(-1,-1)};
		protected Square[] zOther= {Square(0,1),Square(1,1),Square(0,0),Square(-1,-1),Square(0,-1)};
		protected Square[] zO1= {Square(-1,1),Square(-1,0),Square(0,0),Square(1,0),Square(1,-1)};
		
		protected Square[] i= {Square(0,4),Square(0,3),Square(0,2),Square(0,1),Square(0,0)};
		protected Square[] i1= {Square(0,0),Square(1,0),Square(2,0),Square(3,0),Square(4,0)};
		
		protected Square[] t= {Square(-1,0),Square(0,0),Square(1,0),Square(0,-1),Square(0,-2)};
		protected Square[] t1= {Square(1,1),Square(-2,0),Square(-1,0),Square(0,0),Square(0,-1)};
		protected Square[] t2= {Square(0,2),Square(0,1),Square(-1,0),Square(0,0),Square(1,0)};
		protected Square[] t3= {Square(0,1),Square(0,0),Square(1,0),Square(2,0),Square(0,-1)};
		
		protected Square[] v= {Square(0,2),Square(0,1),Square(0,0),Square(1,0),Square(2,0)};
		protected Square[] v1= {Square(0,0),Square(1,0),Square(2,0),Square(0,-1),Square(0,-2)};
		protected Square[] v2= {Square(-2,0),Square(-1,0),Square(0,0),Square(0,-1),Square(0,-2)};
		protected Square[] v3= {Square(0,2),Square(0,1),Square(-2,0),Square(-1,0),Square(0,0)};
		
		protected Square[] w= {Square(-1,1),Square(-1,0),Square(0,0),Square(0,-1),Square(1,-1)};
		protected Square[] w1= {Square(0,1),Square(1,1),Square(-1,0),Square(0,0),Square(-1,-1)};
		protected Square[] w2= {Square(-1,1),Square(0,1),Square(0,0),Square(1,0),Square(1,-1)};
		protected Square[] w3= {Square(1,1),Square(0,0),Square(1,0),Square(-1,-1),Square(0,-1)};
		
		protected Square[] yMain= {Square(0,1),Square(-1,0),Square(0,0),Square(0,-1),Square(0,-2)};
		protected Square[] yM1= {Square(0,1),Square(-2,0),Square(-1,0),Square(0,0),Square(1,0)};
		protected Square[] yM2= {Square(0,2),Square(0,1),Square(0,0),Square(1,0),Square(0,-1)};
		protected Square[] yM3= {Square(-1,0),Square(0,0),Square(1,0),Square(2,0),Square(-1,0)};
		
		protected Square[] yOther= {Square(0,1),Square(0,0),Square(1,0),Square(0,-1),Square(0,-2)};
		protected Square[] yO1= {Square(-2,0),Square(-1,0),Square(0,0),Square(1,0),Square(0,-1)};
		protected Square[] yO2= {Square(0,2),Square(0,1),Square(-1,0),Square(0,0),Square(0,-1)};
		protected Square[] yO3= {Square(0,1),Square(-1,0),Square(0,0),Square(1,0),Square(2,0)};
		
		protected Square[] nMain= {Square(-1,1),Square(-1,0),Square(0,0),Square(0,-1),Square(0,-2)};
		protected Square[] nM1= {Square(0,1),Square(1,1),Square(-2,0),Square(-1,0),Square(0,0)};
		protected Square[] nM2= {Square(0,2),Square(0,1),Square(0,0),Square(1,0),Square(1,-1)};
		protected Square[] nM3= {Square(0,0),Square(1,0),Square(2,0),Square(-1,-1),Square(0,-1)};
		
		protected Square[] nOther= {Square(1,1),Square(0,0),Square(1,0),Square(0,-1),Square(0,-2)};
		protected Square[] nO1= {Square(-2,0),Square(-1,0),Square(0,0),Square(0,-1),Square(1,-1)};
		protected Square[] nO2= {Square(0,2),Square(0,1),Square(-1,0),Square(0,0),Square(-1,-1)};
		protected Square[] nO3= {Square(-1,1),Square(0,1),Square(0,0),Square(1,0),Square(2,0)};
		
		protected Square[] fMain= {Square(0,1),Square(1,1),Square(-1,0),Square(0,0),Square(0,-1)};
		protected Square[] fM1= {Square(0,1),Square(-1,0),Square(0,0),Square(1,0),Square(1,-1)};
		protected Square[] fM2= {Square(0,1),Square(0,0),Square(1,0),Square(-1,-1),Square(0,-1)};
		protected Square[] fM3= {Square(-1,1),Square(-1,0),Square(0,0),Square(1,0),Square(0,-1)};
		
		protected Square[] fOther= {Square(-1,1),Square(0,1),Square(0,0),Square(1,0),Square(0,-1)};
		protected Square[] fO1= {Square(1,1),Square(-1,0),Square(0,0),Square(1,0),Square(0,-1)};
		protected Square[] fO2= {Square(0,1),Square(-1,0),Square(0,0),Square(0,-1),Square(1,-1)};
		protected Square[] fO3= {Square(0,1),Square(-1,0),Square(0,0),Square(1,0),Square(-1,-1)};
		
		protected Square[] lMain= {Square(0,3),Square(0,2),Square(0,1),Square(0,0),Square(1,0)};
		protected Square[] lM1= {Square(0,0),Square(1,0),Square(2,0),Square(3,0),Square(0,-1)};
		protected Square[] lM2= {Square(-1,0),Square(0,0),Square(0,-1),Square(0,-2),Square(0,-3)};
		protected Square[] lM3= {Square(0,1),Square(-3,0),Square(-2,0),Square(-1,0),Square(0,0)};
		
		protected Square[] lOther= {Square(0,3),Square(0,2),Square(0,1),Square(0,0),Square(-1,0)};
		protected Square[] lO1= {Square(0,1),Square(0,0),Square(1,0),Square(2,0),Square(3,0)};
		protected Square[] lO2= {Square(0,0),Square(1,0),Square(0,-1),Square(0,-2),Square(0,-3)};
		protected Square[] lO3= {Square(-3,0),Square(-2,0),Square(-1,0),Square(0,0),Square(0,-1)};

		public Square Square(int j, int k) {
			Square a=new Square(j,k);
			return a;
		}

		
		
	}