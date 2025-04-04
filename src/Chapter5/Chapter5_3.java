package Chapter5;
/*
 * Chapter 5.3
 * Palindrome integer. Write the methods with the following headers
 * Return the reversal of an integer, i.e., reverse(456) returns 654
 * public static int reverse(int number)
 * 
 * Return true if number is a palindrome
 * public static boolean isPalindrome(int number)
 * 
 * Use the reverse method to implement isPlaindrome. A number is a palindrome if its reversal is the same as itself.
 * Program will promt user to enter an integer and reports whether the integer is a palindrome.
 */
import java.util.Scanner;

public class Chapter5_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		
		
		
		if (isPalindrome(number))
			System.out.println("The number " + number + " is a palindrome.");
		else
			System.out.println("The number " + number + " is not a palindrome.");
		
		input.close();
	}
	
	public static int reverse(int number) {
		int reversedNum = 0, remainder;
		
		while (number != 0) {
			remainder = number % 10;
			reversedNum = reversedNum * 10 + remainder;
			number /= 10;
		}
		return reversedNum;
	}
	
	public static boolean isPalindrome(int number) {
		
		if (reverse(number) == number)
			return true;
		else
			return false;
		
	}

}
