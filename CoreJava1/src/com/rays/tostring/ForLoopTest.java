package com.rays.tostring;

import java.util.ArrayList;
import java.util.List;

public class ForLoopTest {
	public static void main(String[] args) {
		
		
		List c = new ArrayList();
		c.add("love");
		c.add("kush");
		c.add("aditya");
		c.add("rohan");
		c.add("mohan");
		
		for (int i = 0; i <c.size(); i++) {
			//Object o = c;
		
			
			System.out.println(c.get(i));
			
			System.out.println();
			
		}
	}

}
