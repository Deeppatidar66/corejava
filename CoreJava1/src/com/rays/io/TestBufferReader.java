package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferReader {
	
	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("C:\\Users\\dipan\\Desktop\\io\\bro.txt");
		
		BufferedReader in = new BufferedReader(file);
		
		String line = in.readLine();
		
		while (line != null) {
			
			System.out.println(line);
			line = in.readLine();
			
		}
		in.close();
		file.close();
	
		
		
	}

}
