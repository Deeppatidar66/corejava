package com.in.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calendar {
	public static void main(String[] args) {
		Date toaday = new Date ();
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(toaday);
		
		for( int i =1; i<=12; i++) {
			cal.add(Calendar.DATE, 30);
			System.out.println(cal.getTime());
		}
		
	}

}
