package Chapter5;
/*
 * Chapter 5.6
 * Display patterns. Write a method to display a pattern as follows in the textbook.
 * 
 * The method header is
 * public static void displayPattern(int n)
 */
import java.util.Scanner;

public class Chapter5_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many lines do you want to print: ");
		int n = input.nextInt();
		
		input.close();
		
		displayPattern(n);
		
	}
	
	public static void displayPattern(int n) {
		
		for (int i = 0; i < n; i++) {
			for (int spaces = 0; spaces < n - i - 1; spaces++) {
				System.out.print("  ");
			} 
			
			for (int a = i + 1; a > 0; a--) {
				System.out.print(a + " ");
			}
			
			System.out.print("\n");
		}
	}

}
