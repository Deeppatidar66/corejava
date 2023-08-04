package com.rays.primenumber;

public class WhileLoop {
	public static void main(String[] args) {
		int number = 153;
		int r;
		int n = number ;
		 int sum=0;`
				
			while (n>0) {
				r=n%10;
				 sum = sum+(r*r*r);
				 n=n/10;
			}
				
		
		if(number == sum) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("  Not Armstrong number");
		}
	}

}



