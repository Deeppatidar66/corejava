package com.rays.threads;

public class TestWithThread {
	public static void main(String[] args) {
		
		
		WithThread t1 = new WithThread("antulesah");
		WithThread t2 = new WithThread("sakal");
		
	t1.start();
	t2.start();
	}
	

}
