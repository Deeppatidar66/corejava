package co.arrey;

public class Arrey2D {
	public static void main(String[] args) {
		int[][] tabale = new int [10][10];
		for(int i=0; i<tabale.length; i++) {
			for(int j=0; j<tabale.length; j++) {
				tabale [i] [j] = (i+1)*(j+1);
			}
		}
		for(int i =0; i<tabale.length; i++) {
			for(int j=0; j<tabale.length; j++) {
				System.out.print(tabale [i][j] + "\t");
			}
			System.out.println();
		}
	}

}
