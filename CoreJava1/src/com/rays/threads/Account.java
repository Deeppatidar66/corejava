package com.rays.threads;

public class Account {
	private int balance =0;
	
	public void setBalance(int balance) {
		this.balance = balance;
	
	}
	public int getBalance() {
		return balance;
	}
	public synchronized void Deposite(String name , int amt) {
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int total = getBalance()+amt;
		setBalance(total);
		System.out.println(name +" "+total);
	}

}
