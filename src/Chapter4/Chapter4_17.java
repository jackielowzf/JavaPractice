package Chapter4;
/*
 * Display a Pyramid. Program will prompt the user to enter an integer from 1 to 15 and 
 * display a pyramid.
 */
import java.util.Scanner;

public class Chapter4_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of lines: ");
		int number = input.nextInt();
		
		input.close();
		
		
		//Printing rows
		for (int i = 0; i < number; i++) {
			
			//Printing spaces
			for (int a = i; a < number - 1; a++) {
				System.out.print("  ");
			}
			//Printing descending numbers
			for (int b = i + 1; b > 0; b--) {
				System.out.print(b +" ");
			}
			//Printing ascending numbers
			for (int c = 2; c < i + 2; c++) {
				System.out.print(c + " ");
			}
			//Printing spaces
			for (int a = i; a < number - 1; a++) {
				System.out.print("  ");
			}
			
			System.out.print("\n");
		}
		
		
	}
	

}
