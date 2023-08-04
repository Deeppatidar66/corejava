package com.rays.exception;

public class TestUnchecked {
	public static void main(String[] args) {
	  int a =11;
	  if (a>10) {
		  try {
		 throw new Unchecked();
	  }
		  catch (Exception e) {
			  System.out.println(e);
		  }
	   
	}else {
		System.out.println("a is less than 10");
	}
	  System.out.println("after if else");

	}
}
