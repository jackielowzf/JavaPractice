/*
 * Chapter 3.19
 * Compute the perimeter of a triangle. Program reads three edges for a triangle 
 * and computes perimeter if input is valid. Otherwise, display input is invalid. 
 * Input is valid if sum of every pair of two edges is greater than the remaining edge.
 */

import java.util.Scanner;

public class Chap3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Asks user for 3 inputs
		System.out.print("Enter three sides of a triangle in m (e.g. 4 6 5): ");
		
		double length1 = input.nextDouble();
		double length2 = input.nextDouble();
		double length3 = input.nextDouble();
		
		//Check for validity
		while (length1 + length2 <= length3 || length1 + length3 <= length2 || length2 + length3 <= length1) {
			System.out.println("Invalid entry. Sum of every pair must be greater than remaining edge \nPlease enter three new sides: ");
			length1 = input.nextDouble();
			length2 = input.nextDouble();
			length3 = input.nextDouble();
		}
		
		//Display perimeter
		double perimeter = length1 + length2 + length3;
		
		System.out.println("The perimeter of the triangle is " + perimeter);
	}

}
