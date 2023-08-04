package com.rays.java8;

public class LambdaHEello {
	public static void main(String[] args) {
		Hello l = ()->{
			System.out.println("this is lambda");
		};
		l.say();
	}
}
	