package Chapter7;
/*
 * Chapter 7.1
 * (Sum elements column by column) Write a method that returns the sum of all the elements in a specified
 * column in a matrix using the following header:
 * 
 * public static double sumColumn(double[][] m, int columnIndex)
 * 
 * Write a test program that reads a 3-by-4 matrix and displays the sum of each column. Here is a sample run: (according to textbook)
 */


public class Chapter7_1 {
	public static void main(String args[]) {
		
		double[][] m = {{1.5, 2, 3, 4},
						{5.5, 6, 7, 8},
						{9.5, 1, 3, 1}};
		
		
		for (int i = 0; i < m[0].length; i++) {
		System.out.println("Sum of the elements at column " + i + " is " + sumColumn(m, i));
		}
		
	}
	
	
	public static double sumColumn(double[][] m, int columnIndex) {
	
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		return sum;
	}
}
