package Chapter5;
/*
 * Format an interger
 * Write a method with the following header to format the integer with the specified width
 * 
 * public static String format(int number, int width)
 * 
 * The method returns a string for the number with one or more prefix 0s. The size of the string is the
 * width. For example, format(24, 4) returns 0034 and format(34, 5) returns 00034. If the number is longer 
 * than the width, the method returns the string representation for the number. For example, format(34, 1) returns 34.
 * 
 * Write a test program that promts the user to enter a number and its width and displays a string returned by
 * invoking format(number, width).
 */
import java.util.Scanner;

public class Chapter5_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		System.out.println("How many 0s do you want to prefix the number with: ");
		int prefixWidth = input.nextInt();
		
		input.close();
		
		
		
	}
	
	public static String format(int number, int width) {
		
		return   ;
	}

}
