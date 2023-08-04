package com.rays.serializetion;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteMarksheet {
	public static void main(String[] args)throws Exception {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\dipan\\Desktop\\io\\marksheet.txt");
		
	    ObjectOutputStream out = new ObjectOutputStream(file);
	
	    Marksheet m= new Marksheet();
     	
     	m.name= "dipanshu patidar";	
     	m.hindi= 62;
     	m.english= 65;
     	m.pcmb= 67;
//     	m.total = 0;
     	
     	
     	out.writeObject(m);
     	out.close();
     	file.close();
     	
     	
     			
			
	
	
	
		
	}

}
