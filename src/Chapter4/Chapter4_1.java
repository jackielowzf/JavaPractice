package Chapter4;
/*
 * Chapter 4.1 
 * Count positive and negative numbers and compute the average of numbers. Program will read an unspecified number of integers, determines
 * how many positive and negative values have been read, and computes the total and average of the input
 * values (not counting zeros). Program will end with the input 0. Display the average as a floating-point number.
 */

import java.util.Scanner;

public class Chapter4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = 0 , plus = 0 , minus = 0 , total = 0;
		double avg = 0;
		
		//Ask user for inputs
		do {
			System.out.println("Enter an integer, the input ends if it is 0: ");
			number = input.nextInt();
			
			if (number > 0)
				plus++;
			else if (number < 0)
				minus++;
			
			total += number;
				
			
		} while (number != 0);
		
		
		avg = (double)(total) /(double)(plus + minus); 
		
		input.close();
		
		//Display result
		System.out.println("The number of positives is " + plus + "\n" +
						   "The number of negatives is " + minus + "\n" +
						   "The total is " + total + "\n" +
						   "The average is " + avg);
		
	}

}
