package com.rays.contructorcalling;

public class TestShape {
	public static void main(String[] args) {
	
		Rectangle r = new Rectangle(10,20,"blue",30);
		
	
		
	System.out.println(r.getLength());
	System.out.println(r.getWidth());
	System.out.println(r.getColor());
	System.out.println(r.getBordarwidth());
	
	}

}
