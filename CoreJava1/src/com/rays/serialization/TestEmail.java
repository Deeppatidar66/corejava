package com.rays.serialization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TestEmail {
	public static void main(String[] args) throws Exception {

		FileReader in = new FileReader("C:\\Users\\dipan\\Desktop\\io\\email.txt");

		BufferedReader file = new BufferedReader(in);
		PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\dipan\\Desktop\\io\\cemail.txt"));

		String line = file.readLine();
		//String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{3,})$";
		
		String emailreg = "^([\\w]*[\\w\\.]*(?!\\.)@gmail.com)";

		while (line != null) {

			if (line.matches(emailreg)) {

				out.println(line);
				
			} else {
				System.out.println("invalid = " + line);
			}
			line = file.readLine();

		}
		out.close();
		file.close();
		in.close();

	}

}
