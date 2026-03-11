package Chapter7;
/* 
 * Chapter 7.2
 * (Sum the major diagonal in a matrix) Write a method that sums all the numbers in the major diagonal in an n X n matrix
 * of integers using the following header:
 * 
 *  public static double sumMajorDiagonal(double[][] m)
 *  
 *  Write a test program that reads a 4-by-4 matrix and displays the sum of all its elements on the major diagonal. 
 *  Here is a sample run: (according to textbook)
 */
public class Chapter7_2 {
	public static void main(String args[]) {
		
		double[][] m = {{1, 2, 3, 4.0},
						{5, 6.5, 7, 8},
						{9, 10, 11, 12},
						{13, 14, 15, 16}};
	
		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m));
	
	
	}
	
	public static double sumMajorDiagonal(double[][] m) {
		
		double sum = 0;
		
		for(int i = 0; i < m.length; i++) {
			sum += m[i][i];			
		}
		
		return sum;
	}

}
