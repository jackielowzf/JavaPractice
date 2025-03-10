package Chapter3;
/*
 * Chapter 3.26 
 * Prompts the user to enter an integer and determines whether
 * it is divisible by 5 and 6
 * it is divisible by 5 or 6
 * it is divisible by 5 or 6, but not both
 */
import java.util.Scanner;

public class Chap3_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		
		input.close();
		
		//Check if number is divisible by 5 and 6
		System.out.println("Is " + number + " divisible by 5 and 6? ");
		
		if (number % 5 == 0 && number % 6 == 0)
			System.out.println("True ");
		else
			System.out.println("False ");
		
		//Check if number is divisible by 5 or 6
		System.out.println("Is " + number + " divisible by 5 or 6? ");
		
		if (number % 5 == 0 || number % 6 == 0)
			System.out.println("True ");
		else 
			System.out.println("False ");
		
		//Check if number is divisible by 5 or 6 exclusively
		System.out.println("Is " + number + " divisible by 5 or 6 but not both? ");
		
		if (number % 5 == 0 ^ number % 6 == 0)
			System.out.println("True");
		else
			System.out.println("False");
		
				
	}

}
