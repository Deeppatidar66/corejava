package com.rays.java8;

public class TestHello {
	public static void main(String[] args) {
		Hello h = new Hello() {
			
			@Override
			public void say() {
				System.out.println("this say method");
			}
//			
//			@Override
//			public void hii() {
//				System.out.println("this hii method");
//				
//			}
		};
		h.say();
//		h.hii();
	}

}
