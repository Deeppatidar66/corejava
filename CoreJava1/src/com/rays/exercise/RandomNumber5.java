package com.rays.exercise;
import java.util.*;

public class RandomNumber5{
	public static void main(String[] args) {
	
		Random r = new Random();
		int n;
		
		for (int i = 0; i < 10; i++) {
			n =r.nextInt(100);
			
//			int a = r.nextint(100)+1;
			
			
			System.out.println(n);
			
		}
		
	}

}
