package com.in.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateParse {

	public static void main(String[] args) throws ParseException {
		String str = "05/07/2022";
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		Date d = sdf.parse(str);
		System.out.println(d);
	}
}
