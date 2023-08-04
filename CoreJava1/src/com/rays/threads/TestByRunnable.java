package com.rays.threads;

public class TestByRunnable {
	
	public static void main(String[] args) {
		
		ByRunnable b1 = new ByRunnable("Antulesh");
		ByRunnable b2 = new ByRunnable("shivam");
		
		Thread t1 = new Thread(b1);
		t1.setPriority(10);
		Thread t2 = new Thread(b2);
		t2.setPriority(1);
		
		t1.start();
		t2.start();
		
		
	}

}
