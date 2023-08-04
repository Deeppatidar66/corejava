package com.rays.inheritance;

public class TestShape {
	public static void main(String[] args) {

		Shape s = new Shape();
		s.setBordarWidth(50);
		s.setColour("red");
		Rectangle r = new Rectangle();
		r.setBordarWidth(20);
		r.setColour("blue");
		r.setLenght(80);
		r.setWith(22);

		System.out.println(s.getBordarWidth());
		System.out.println(s.getColour());
		System.out.println(r.getBordarWidth());
		System.out.println(r.getColour());
		System.out.println(r.getLenght());
		System.out.println(r.getWith());

	}

}
