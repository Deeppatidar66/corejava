package co.arrey;

public class ArreyHight {
public static void main(String[] args) {

	int[] arr = {45,411,12,555,11,100,67,109};
	
	int min = 0;
	int max = 0;
	
	for(int i=0; i<arr.length; i++) {
		
		if(arr[i]>max) {
			min = max;
			max = arr[i];
			
		}
		if(arr[i]<max && arr[i]>min) {
			min = arr[i];
		}
		
	}
	System.out.println(min);
	System.out.println(max);
}
}
  
