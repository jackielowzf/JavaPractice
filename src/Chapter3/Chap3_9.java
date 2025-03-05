/*
 * Chapter 3.9
 * ISBN-10 consists of 10 digits. The last digit is a checksum, calculated by 
 * the other nine digits using a formula provided in textbook. If checksum is 10,
 * last digit is donoted as X according to ISBN-10 convention. Write a program that
 * prompts user to enter the first 9 digits and display the 10-digit ISBN (Including leading 0s).
 */
import java.util.Scanner;


public class Chap3_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Asks user for first 9 digits
		System.out.print("Enter the first 9 digits of an ISBN as an integer: ");
		int isbn = input.nextInt();
		

		//Call to checksum() funciton to get 10th digit
		int d10 = checksum(isbn);
		String format = String.format("%09d", isbn);
		
		
		//Print results
		if (d10 == 10)
			System.out.println("The ISBN-10 number is " + format + "X");
		else
			System.out.printf("The ISBN-10 number is " + format + d10);			
		
		
	}
	
	
	
	public static int checksum(int isbn) {
		int sum = 0;
		int digit = 0;
		
		for (int i = 1;  i < 10 ; i++) {
			digit = (int)(isbn / (100000000 / Math.pow(10, i - 1)));
			sum += digit * i;
			isbn %= (100000000 / Math.pow(10, i - 1));
			
		}	
		
		sum %= 11;
		return sum;
		
	}

}
