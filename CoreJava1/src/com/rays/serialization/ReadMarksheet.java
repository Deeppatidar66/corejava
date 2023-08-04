package com.rays.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.rays.serializetion.Marksheet;

public class ReadMarksheet {
	public static void main(String[] args)throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\dipan\\Desktop\\io\\marksheet.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		
		
	Marksheet m =(Marksheet) in.readObject();
	
	
	System.out.println(m.name);
	System.out.println(m.hindi);
	System.out.println(m.english);
	System.out.println(m.pcmb);
//	System.out.println(m.total);
	
	
	in.close();
	file.close();
		
	}

}
