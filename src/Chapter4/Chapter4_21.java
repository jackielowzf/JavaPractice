package Chapter4;
/*
 * Chapter 4.21
 * Financial application: compare loans with various interest rates. 
 * Program that lets the user enter the loan amount and loan period in number of years
 * and displays the monthly and total payments for each interest rate starting from 5% to 8%, 
 * with an increment of 1/8. 
 */
import java.util.Scanner;

public class Chapter4_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Asks user for loan amount and number of years
		System.out.println("Loan amount: ");
		double loanAmount = input.nextDouble();
		System.out.println("Number of Years: ");
		int years = input.nextInt();
		
		input.close();
		
		double interestRate = 0.0;
		double monthlyInterest = 0;
		double monthlyPayment = 0;
		double totalPayment = 0;
		
		System.out.println("Interest Rate     Monthly Payment   Total Payment");
		
		for (int i = 0; i < 25; i++) {
			
			interestRate =  5.0 + (1.0 / 8.0 * i);
			monthlyInterest = interestRate / 1200;
			monthlyPayment = monthlyPayment(loanAmount, monthlyInterest, years);
			totalPayment = monthlyPayment * years * 12;
			
			System.out.printf("%-18s%-18s%-18s%n",
							  interestRate + "%",
							  String.format("%.2f", (int)(monthlyPayment * 100) / 100.0),
							  String.format("%.2f", (int)(totalPayment * 100) / 100.0));
			
			
		}
		
	}
	
	public static double monthlyPayment(double loanAmount, double monthlyInterest, int numberOfYears) {
		
		double mpayment = loanAmount * monthlyInterest / (1 - 1 / Math.pow(1 + monthlyInterest, numberOfYears * 12));
		
		return mpayment;
	}

}
