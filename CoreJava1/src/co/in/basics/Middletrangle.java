package co.in.basics;

public class Middletrangle {
 public static void main(String[] args) {
	 int n=10;
	
	 for(int i=1; i<=n; i++) {
		 
		 for(int j=n; j>=i; j--) {
			
			 System.out.print("  ");
			 }
			  
		 for(int k=1; k<=i; k++) {
			  
			 System.out.print("*");
			 System.out.print("   ");
		 }
		 System.out.println();
	 }
}
}

