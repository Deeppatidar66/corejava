package com.rays.overriding;

public class Circle extends Shape {
	
	public static final double PI = 3.14;
	private double radius = 0;
	
	public static double getPi() {
		return PI;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double area() {
		double area = (PI*radius*radius)*1*2;
		System.out.println("Circle Area"+area);
		return area;
	
	     

	}
	
	
	

}
