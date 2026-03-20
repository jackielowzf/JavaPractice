package Chapter7;
/*
 * Chapter 7.6
 * Write a test program that prompts the user to enter two matrices and displays
their product. Here is a sample run: (according to textbook)
 */
public class Chapter7_6 {
	public static void main(String args[]) {
		double[][] m = {{1, 2, 3},
						{4, 5, 6},
						{7, 8, 9}};
		
		double[][] n = {{0, 2, 4},
						{1, 4.5, 2.2},
						{1.1, 4.3, 5.2}};
		
		printArray(multiplyMatrix(m, n));
	}
	
	public static void printArray(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++){
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		
		if (a[0].length != b.length) {
			System.out.println("Invalid matrices input");
			return null;
		}
		
		double[][] m = new double[a.length][b[0].length];
		
		for (int i = 0; i < m.length; i++) {
			
			
			for (int j = 0; j < m[i].length; j++) {
				
				double sum = 0;
				for (int counter = 0; counter < a[0].length; counter++) {
					sum += a[i][counter] * b[counter][j];
				}
				
				m[i][j] = sum;
			}
		}
		
		return m;
	}

}
