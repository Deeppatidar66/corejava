package com.rays.overriding;

import com.sun.source.tree.ForLoopTree;

//import sun.text.resources.cldr.ext.FormatData_es_419;

public class TestShape {
	public static void main(String[] args) {
//		
//		Shape s = new Circle();
//		
//		Circle c = (Circle) s;
//		c.setRadius(50.50);
//		c.area();
//		
//		Shape s1 = new Rectangle();
//		
////		Rectangle r = (Rectangle) s1;
//	
//		s1.setBorderWidth(52);
//	    s1.setColor("red");
////		r.setLength(53);
////		r.setWidth(83);
//        s1.area();
//		
//		
		
		Shape[] s = new Shape[3];
		
		
		
		s[0] = new Rectangle();
		Rectangle r = (Rectangle) s[0];
		r.setLength(20);
		r.setWidth(36);
		r.setColor("red");
		
		
		s[1] = new Circle();
		Circle c = (Circle) s[1];
		c.setRadius(50.50);
		c.setColor("blue");
		
		
		s[2] = new Triangle();
		Triangle t = (Triangle) s[2];
		t.setBase(12);
		t.setHight(23);
		t.setColor("yellow");
		
		
		double totalArea = 0;
		
		for (int i = 0; i < s.length; i++) {
			
			System.out.println(s[i].getColor());
			
			totalArea = totalArea+s[i].area();
			
		}
		
		
		
		
	}
}
