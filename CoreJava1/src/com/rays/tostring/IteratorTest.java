package com.rays.tostring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
		Collection c= new ArrayList() ;
		
		c.add("ram");
		c.add("lakshaman");
		c.add("bharat");
		
		Iterator it = c.iterator();
		
		while (it.hasNext()) {
			Object o = (Object)it.next();	
			
			System.out.println(o);
			it.remove();
			System.out.println(o);
		}
		
			
	
	}

}
