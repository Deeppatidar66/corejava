package com.rays.threads;

public class Racing extends Thread {
	
	String name = null;

    static Account a = new Account();
    
    public Racing(String name ) {
    	this.name=name;
    	
    }@Override
    public void run() {
    	for (int i = 0; i <5; i++) {
    		this.a.Deposite(name, 100);
			
		}
    }
    
	


}
