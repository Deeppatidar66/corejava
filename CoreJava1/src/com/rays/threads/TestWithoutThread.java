package com.rays.threads;

public class TestWithoutThread {
	public static void main(String[] args) {
		
		Withoutthread t1 = new Withoutthread("dipanshu");
		Withoutthread t2 = new Withoutthread("shivam");
		
		t1.run();
		t2.run();
	}

}
