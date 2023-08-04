package com.rays.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		List l = new ArrayList();

		l.add(new Employee(02, "shyam", "indore"));
		l.add(new Employee(06, "ram", "dalka"));
		l.add(new Employee(01, "dianshu", "khargone"));

		l.add(new Employee(04, "tushar", "gavsan"));
		l.add(new Employee(05, "tarun", "jhanshi"));
		l.add(new Employee(07, "antulesh", "barwani"));
		l.add(new Employee(04, "aatushar", "aakhandwa"));
		
//		orderByName o = new orderByName();

		Collections.sort(l, new orderByName());

		Iterator it = l.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

