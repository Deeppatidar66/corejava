package com.rays.deepcloning;

public class Customar implements Cloneable {
	String name = null;
	Account account = null;
	
	public Customar(String name ) {
		this.name= name;
		this.account= new Account(300);
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customar c = (Customar) super.clone();
        c.account = (Account) account.clone(); 
		return c;
	}

}
