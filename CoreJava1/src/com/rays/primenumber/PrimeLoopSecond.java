package com.rays.primenumber;

public class PrimeLoopSecond {
	public static void main(String[] args) {
		        int n =15;
				int count =0;
		        
				for(int i=2; i<n; i++) {
					if(n % i == 0) {
					count++;
					System.out.println("wo number"+i);
				
					}
					if(count==0) {
						System.out.println("prime number");
					}
					else {
						System.out.println("not prime number");
					}
				}
	}

}
