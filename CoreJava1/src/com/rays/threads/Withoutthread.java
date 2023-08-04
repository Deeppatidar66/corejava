package com.rays.threads;

public class Withoutthread {
	
	String name = null;
	
	public Withoutthread(String name) {
		this.name= name;
	}
	
	public void run() {
		for (int i = 1; i <=10; i++) {
			
			System.out.println(i + " "+ name);
			
			
		}
		
	}

}
