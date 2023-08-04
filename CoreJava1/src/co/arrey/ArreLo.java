package co.arrey;

public class ArreLo {
public static void main(String[] args) {
	int [] arr = {555,100,2,-1,1,6,85,95};
	
	int a = arr[0];
	
	for(int i =0; i<arr.length; i++) {
		
		if(arr[i]<a) {
			
			a =arr[i];
			
		}
		
	}
	System.out.println(a);
}
}
