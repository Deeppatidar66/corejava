package com.rays.compare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FaiolFast {
	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add("dipanshu");
		l.add("shivam");
		l.add("antulesh");
		l.add("omi");
		l.add("nirmal");
		
		Iterator it = l.iterator();
		
		l.add("amit");
		
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
			
		}
		
	}

}
