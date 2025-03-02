import java.util.Scanner;

public class Prac{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Asks user to input integer between 0 ~ 1000
		System.out.println("Enter an integer between 0 and 1000 (999 accepted, 1000 not accepted): ");
		int number = input.nextInt();
		
		
		// Break integer apart (first digit)
		int FirstDigit = number / 100;
		int remainder = number % 100;
		
		// Break (second digit)
		int SecondDigit = remainder / 10;
		remainder %= 10;
		
		// sum of digits
		int sum = FirstDigit + SecondDigit + remainder;
		
		// Display result
		System.out.println("The sum of all the digits of the number " +
				number + " is " + sum);
		
		
		
	}
}