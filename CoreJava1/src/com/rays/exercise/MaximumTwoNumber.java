package com.rays.exercise;

public class MaximumTwoNumber {
	public static void main(String[] args) {
		int [] arr = {45,25,33,500,24,582,18,654};
		int min = 0;
		int max = 0;
		
		for(int i = 0; i <arr.length; i++) {
			
			if(arr[i]>max) {
				min = max;
				max = arr[i];
				
			}
			if(arr[i]<max && arr[i]>min){
			min = arr[i];
		}
			
		}
		System.out.println(min);
		System.out.println(max);
	}

}
