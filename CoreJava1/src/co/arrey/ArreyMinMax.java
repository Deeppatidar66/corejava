package co.arrey;

public class ArreyMinMax {
		public static void main(String[] args) {
			int [] arr = {100,120,800,67,500,55,200,600};
			
			int min = 0;
			int max = 0;
			
			for(int i=0; i<arr.length; i++) {
				
				if(arr[i]>max) {
					min = max;
					max = arr[i];
				}
				
				if(max>arr[i] && min<arr[i]) {
					min = arr[i];
				}
			}
			System.out.println();
					}
}
