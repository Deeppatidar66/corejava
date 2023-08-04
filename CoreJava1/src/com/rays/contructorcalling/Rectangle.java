package com.rays.contructorcalling;

public class Rectangle extends Shape {
	private int length = 0;
	private int width = 0;
	
	public Rectangle() {
		super();		
	}
	public Rectangle(int length, int width, String color, int Bordarwidth) {
		super(color,Bordarwidth);
		this.length = length;
		this.width = width;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}

}
