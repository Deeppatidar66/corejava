package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ForloopFileWriter {
	
	public static void main(String[] args) throws IOException{
		
		FileWriter file = new FileWriter("C:\\Users\\dipan\\Desktop\\io\\deep.txt");
		
		PrintWriter pw = new PrintWriter(file);
		
		for (int i = 0; i < 5; i++) {
			 pw.println(i +"hello");
			
		}
		pw.close();
		file.close();
	}
	

}
