package com.rays.tostring;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {
	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();
		s.add(100);
		s.add(500);
		s.add(600);
		s.add(500);
		s.add(700);
		s.add(300);
		s.add(200);
		s.add(100);
		
		
		
		for (Object o : s) {
			System.out.println(o);
			
		}
		System.out.println("===================================");
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet(700));
		System.out.println(s.tailSet(700));
		
		
	}

	
}
