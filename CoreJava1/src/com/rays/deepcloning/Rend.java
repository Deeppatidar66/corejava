package com.rays.deepcloning;

public class Rend {
	int banlance =0;
	public Rend (int balance) {
		this.banlance= balance;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
				return super.clone();
	}

}
