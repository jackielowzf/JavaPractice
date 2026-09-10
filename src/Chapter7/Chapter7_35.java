package Chapter7;
/*
 * Chapter 7.35
 * (Largest block) Given a square matrix with the elements 0 or 1, write a program to
find a maximum square submatrix whose elements are all 1s. Your program
should prompt the user to enter the number of rows in the matrix. The program
then displays the location of the first element in the maximum square submatrix
and the number of the rows in the submatrix. Here is a sample run:
Enter the number of rows in the matrix:
Enter the matrix row by row:
The maximum square submatrix is at (2, 2) with size 3
1 0 1 1 1
1 0 1 1 1
1 0 1 1 1
1 1 1 0 1
1 0 1 0 1
5
Your program should implement and use the following method to find the maxi-
mum square submatrix:
public static int[] findLargestBlock(int[][] m)
The return value is an array that consists of three values. The first two values are
the row and column indices for the first element in the submatrix, and the third
value is the number of the rows in the submatrix.
 */
public class Chapter7_35 {
	public static void main(String args[]) {
		int[][] m = {{1, 0, 1, 0, 1},
					 {1, 1, 1, 0, 1},
					 {1, 0, 1, 1, 1},
					 {1, 0, 1, 1, 1},
					 {1, 0, 1, 1, 1}};
		
		int[] results = findLargestBlock(m);
		System.out.println("The maximum square submatrix is at (" +
						   results[0] + ", " + results[1] + ") with size " + results[2]);
		
	}
	
	public static int[] findLargestBlock(int[][] m) {
		int[] result = new int[3];
		int size = 0;
		int maxSize = 0;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				
				size = 0;
				while (isValidSquare(m, i, j, size + 1)) {
					size++;
				}
				
				if (size > maxSize) {
					maxSize = size;
					result[0] = i;
					result[1] = j;
					result[2] = size;
				}
			}
		}
		
		return result;
	}
	
	public static boolean isValidSquare(int[][] m, int row, int col, int size) {
		//Check if the square fits within the matrix
		if (row + size > m.length || col + size > m[row].length) {
			return false;
		}
		
		//Check every element inside the square is 1
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if (m[i][j] == 0) {
					return false;
				}
			}
		}
		
		return true;
	}

}
