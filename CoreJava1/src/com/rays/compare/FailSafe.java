package com.rays.compare;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafe {
	public static void main(String[] args) {
		
	Vector v = new Vector();
	v.add("dipanshu");
	v.add("shyam");
	v.add("nirmal");
	v.add("omi");
	
	Enumeration e = v.elements();
	
	v.add("shivam");
	
	while (e.hasMoreElements()) {
		Object object = (Object) e.nextElement();
		System.out.println(object);
		
	}
	
	}

}
