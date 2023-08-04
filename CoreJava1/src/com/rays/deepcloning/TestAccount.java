package com.rays.deepcloning;

public class TestAccount{
	public static void main(String[] args) throws CloneNotSupportedException {
		Customar c1 = new Customar("dipanshu");
		Customar c2 = (Customar) c1.clone();
		
		c2.name = "shivam";
		c2.account.balance =200;
		
		System.out.println(c1.name);
		System.out.println(c1.account.balance);
		
		System.out.println(c2.name);
		System.out.println(c2.account.balance);
	}
	
}
