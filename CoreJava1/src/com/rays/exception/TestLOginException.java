package com.rays.exception;

public class TestLOginException {
	public static void main(String[] args) {
		
		try {
			
			String name = "admin";
			if(name.equals("admin")) {
//			if(name.equals("dipanshu")) {
				System.out.println("valid user");
			}else {
				LoginException l= new LoginException();
				throw l;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
