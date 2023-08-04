package com.rays.threads;

public class TestRacing {
	public static void main(String[] args) {
		
		Racing r1 = new Racing("shivam");
		Racing r2 = new Racing("antulesh");
		
		r1.start();
		r2.start();
	}

}
