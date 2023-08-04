package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TextReaderWriter {
	public static void main(String[] args)throws IOException {
		
		String source = "C:\\Users\\dipan\\Desktop\\io\\bro.txt";
		String target = "C:\\Users\\dipan\\Desktop\\io\\rays.txt";
		
		FileInputStream in = new FileInputStream(source);
		
		FileOutputStream out = new FileOutputStream(target);
		
		int i = in.read();
		
		while (i !=-1) {
			
			System.out.print(" "+i);
			out.write(i);
			i = in.read();
			
			
		}
		out.close();
		in.close();
		System.out.println(source+"copid your data "+target);
		
		
	}

}
