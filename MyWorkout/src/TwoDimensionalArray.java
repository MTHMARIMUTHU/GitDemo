
public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		String x[][] = new String[2][5];
		System.out.println(x.length); //total no. of rows
		System.out.println(x[0].length); //total number of columns
		
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";
		
		System.out.println(x[1][3]);
		
		//print all the values of 2D array
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[0].length;col++) {
				System.out.println(x[row][col]);
			}
		}
		
		
		
		
		

	}

}