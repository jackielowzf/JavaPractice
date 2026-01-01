package Chapter4;
/*
 * Chapter 4.19
 * Display numbers in a pyramid pattern. Write a nested for loop that prints the output stated in the textbook.
 */

public class Chapter4_19 {
	public static void main(String[] args) {
		
		int row = 8;
				
		for (int i = 0; i < row; i++) {
			
			//Printing spaces
			for (int space = i; space < row - 1; space++) {
				System.out.print("  ");
			}
			//Printing ascending number
			for (int a = 0; a < i + 1; a++) {
				
				System.out.print((int)(Math.pow(2, a)) + " ");
			}
						
			//Printing descending number
			for (int b = 0, c = i; b < i; b++) {
				System.out.print((int)(Math.pow(2, c - 1)) + " ");
				c--;
			}
			
			//Printing spaces
			for (int space = i; space < row - 1; space++) {
				System.out.print("  ");
			}
			
			System.out.print("\n");
		}
	}

}
