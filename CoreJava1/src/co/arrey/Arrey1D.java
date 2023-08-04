package co.arrey;

public class Arrey1D {
	public static void main(String[] args) {
		
	int[] arr = {1,2,3,4,5,6,7,8,9,10};
	//int[] tabale = new int [10];
	
	for(int i=0; i<arr.length; i++) {
		arr [i] = (i+1)*2;
		
	}
	for(int i : arr) {
		System.out.println(i);
		
	}
	}
	

}
