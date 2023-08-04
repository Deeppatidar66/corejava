package com.rays.threads;

public class Deamon1 extends Thread{
	
	String name = null;
	
	public Deamon1(String name ) {
		this.name=name;
	}
	public void run() {
		while (true) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(name);
			
		}
		
		
	}
	
	
	

}
