package com.rays.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadTexFile {
	public static void main(String[] args) throws IOException {
		
		FileReader in = new FileReader("C:\\Users\\dipan\\Desktop\\io\\bro.txt");
		
		int ch = in.read();
		
		while (ch != -1) {
			
//			System.out.print(" "+ch);
			System.out.print((char)ch);
			ch = in.read();
			
		}
		
		in.close();
	}

}
