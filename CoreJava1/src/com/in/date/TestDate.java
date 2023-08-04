package com.in.date;

import java.text.SimpleDateFormat;
import java.util.*;

public class TestDate {

	public static void main(String[] args) {
		
		Date d = new Date ();	
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		System.out.println(sdf.format(d));
	}
}
