package com.rays.exception;

public class TestTryCatch{
	public static void main(String[] args) {
		
		try {
			int a = 0;
			System.out.println("a="+a);
			int b =0;
			System.out.println("b="+b);
			int c = a/b;
		    System.out.println("c="+c);
		    String name = "dipanshu";
	     	System.out.println(name);
	     	
			
		} catch (Exception e) {
		System.out.println(e);
		//	System.out.println(e.getMessage());
			
		}
		System.out.println("after exception");
		
		
	}
	
	

}
