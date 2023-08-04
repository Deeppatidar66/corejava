package com.rays.armstrongnumber;

public class TabalePrint {
	public static void main(String[] args) {
		tabalep(10);
	}
	public static int tabalep(int n) {
		int t = 0;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= 10; j++) {
				t = i*j;
				System.out.print(t + "\t");
				
			}
			System.out.println();
			System.out.println();
		}
		return t;
	}
}
