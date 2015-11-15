package Pentomino;

import java.awt.Color;

public class Square {
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
}
