package com.rays.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class EmployeeWrite {
	public static void main(String[] args)throws Exception {
		FileOutputStream file = new FileOutputStream("C:\\Users\\dipan\\Desktop\\io\\deep.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Employee e = new Employee();
		
		e.name= "dipanshu";
		e.maths = 88;
		e.physics = 59;
		e.chemistry = 65;
		e.temp = 53;
		
		out.writeObject(e);
		
		out.close();
		file.close();
		
	}

}
