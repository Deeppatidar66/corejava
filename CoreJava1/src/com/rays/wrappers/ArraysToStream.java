package com.rays.wrappers;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class ArraysToStream {
	public static void main(String[] args) {
		
		Collection<String> c = Arrays.asList("aman", "kuldeep", "shivam","amntulesh");
		
		Stream<String> s = c.stream();		
//		String[] arr= {"one", "two", "three", "two", "four"};
//		
//		Arrays.stream(arr);
		
//List<String> list = Arrays.asList("ashu","sourabh");
//		
//		Stream<String> s = list.stream();
		
//		Stream<String> s = Arrays.stream(arr);
		
		s.filter(e->e.startsWith("t")).sorted().forEach(e->{System.out.println(e);});
	}
	
	
	}


