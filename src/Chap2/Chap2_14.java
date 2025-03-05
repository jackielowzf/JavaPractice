// Question 2.14  Computing BMI

// Taking weight in kg divided by the square of height in m.

import java.util.Scanner;

public class Chap2_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//declare conversion constants
		final double poundPerKg = 0.45359237;
		final double inchPerM   = 0.0254;
		
		//Get user height and weight
		System.out.println("Enter weight in lb: ");
		double userLb = input.nextDouble();
		System.out.println("Enter height in inches: ");
		double userInch = input.nextDouble();
		
		
		//BMI calculation
		double userKg = userLb * poundPerKg;
		double userM  = userInch * inchPerM;
		
		double bmi = userKg / Math.pow(userM, 2);
		
		
		//Display result
		System.out.printf("BMI is %2.4f", bmi);
		
	}

}
