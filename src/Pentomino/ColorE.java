package Pentomino;

import java.awt.*;
import java.lang.Object;


		public class ColorE extends Color{
		
			private static Color white;
			
		public static  Color color(){
		
		Color b=Color.white;
		//Color color=new color(int r,int g,int b);
		//color=r.setColor();
		
		return b;
		}
		
		public static  Color colorM(){
			
			int R = (int)(Math.random()*256);
			int G = (int)(Math.random()*256);
			int B = (int)(Math.random()*256);
			Color color= new Color(R,G,B);
			
			return color;
			}
			
			public int getColorInt(float R ,float G,float  B){
			
		// r =Math.round(255*r);
	 // r = (r << 16) & 0x00FF0000;
		//return r;
		
				//color d= r;
				//Color d=setColor(r);
				//Color d =Color.get(r);
				
				R=(int)(Math.random()*256);
				G=(int)(Math.random()*256);
				B=(int)(Math.random()*256);
				Color color= new Color(R,G,B);
				
				return color.getRGB();
			}
		
			
			
		
		public ColorE(float R, float G, float B){
			super(R,G,B);
			
		}
			
		
			public static void main(String[] args){
				
			int a=0;//((int)0-256);
			int b=0;//((int)0-256);
			int c=0;//((int)0-256);
			
			ColorE r = new ColorE(a,b,c);
			Color standartWhite = ColorE.color();
			
			}
				
			}
				
			
			//Color s=
			
			
		