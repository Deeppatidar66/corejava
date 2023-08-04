package com.rays.armstrongnumber;

public class ArmStrongNumber {
	
	public static String Dipanshu(int k) {
		int number = k;
		int r;
		int sum =0;
		int n = number;
		
		while (n>0){
			r=n%10;
			sum = sum +(r*r*r);
			n = n/10;
		}
		if(number == sum) {
			
			return "armstrongnumber" + sum;
			
		}else {
			
			return "not armstrongnumber" + sum;
		}
	}
}
