package com.rays.contructorcalling;

public class Shape {
	private String color = null;
	private int Bordarwidth = 0;
	 
	public Shape () {
		System.out.println("def");
		
	}
	public Shape (String color , int Bordarwidth ) {
		this.color= color;
		this.Bordarwidth = Bordarwidth;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setBordarwidth(int bordarwidth) {
		Bordarwidth = bordarwidth;
	}
	public int getBordarwidth() {
		return Bordarwidth;
	}

}
