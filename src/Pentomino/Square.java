package Pentomino;

import java.awt.Color;

public class Square implements Cloneable{
	private int x,y,z;
	private Color c;
	/*
	public Square(int x, int y, int z, Color c){
		this.x=x;
		this.y=y;
		this.z=z;
		this.c=c;
	}*/
	public Square(int x, int y){
		c = Color.BLUE;
		this.x=x;
		this.y=y;
	}
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	public void setZ(int z){
		this.z=z;
	}
	public void setC(Color c){
		this.c=c;
	}
	public void setC(ColorE c){
		this.c=c;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getZ(){
		return z;
	}
	public Color getC(){
		return c;
	}
	public Square copy() {
		Square s = new Square(x,y);
		s.z = z;
		s.c = new Color(c.getRGB());
		return s;
	}
}
