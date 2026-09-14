package chapter9;
import java.util.Scanner;
/*
   	Chapter 9.1
   	
   	(Check SSN ) Write a program that prompts the user to enter a Social Security
number in the format DDD-DD-DDDD, where D is a digit. The program displays
Valid SSN for a correct Social Security number and Invalid SSN otherwise
   	
 */
public class Chapter9_1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Social Security Number (DDD-DD-DDDD): ");
		String ssn = input.next();
		
		isValidNumber(ssn);
		
		input.close();
	}
	
	public static boolean isValidNumber(String number) {
		
		if (number.matches("\\d{3}-\\d{2}-\\d{4}")) {
			System.out.println("Valid SSN.");
		}
		else
			System.out.println("Invalid SSN");
		
		return false;
	}

}
