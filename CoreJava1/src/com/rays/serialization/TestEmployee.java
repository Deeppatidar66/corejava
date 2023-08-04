package com.rays.serialization;

import java.io.FileInputStream;

import java.io.ObjectInputStream;

public class TestEmployee {
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\dipan\\Desktop\\io\\deep.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		
		Employee e = (Employee) in.readObject();
		
		System.out.println(e.name);
		System.out.println(e.maths);
		System.out.println(e.physics);
		System.out.println(e.chemistry);
		System.out.println(e.temp);
		
		
		in.close();
		file.close();
	
		
	}

}
