package com.rays.deepcloning;

public class Cun {
	String name =null;
	Rend r = null;
	
	public Cun (String name) {
		this.name= name;
		this.r=new Rend(1);
		
		
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
			return super.clone();
	}
	

}
