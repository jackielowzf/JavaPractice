package Chapter4;
/*
 * Chapter 4.22
 * Financial application: loan amortization schedule
 * Monthly payment for a given loan pays the principal and the interest. The monthly interest is computed by multiplying
 * the monthly interest rate and the balance (the remaining principal). The principal paid for the month is therefore
 * the monthly payment minus the monthly interest. Program will let the user to enter the loan amount, number of years,
 * and interest rate and displays the amortization schedule for the loan.
 */
import java.util.Scanner;

public class Chapter4_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Asks the user for loan amount, number of years and annual interest rate
		System.out.println("Loan Amount: ");
		double loan = input.nextDouble();
		System.out.println("Number of Years: ");
		int years = input.nextInt();
		System.out.println("Annual Interest Rate: ");
		double interestRate = input.nextDouble();
		
		input.close();
		
		//Get monthly payment and total payment
		double monthlyInterest = interestRate / 1200;
		double monthlyPayment  = monthlyPayment(loan, monthlyInterest, years);
		double totalPayment    = monthlyPayment * 12 * years;
		
		
		System.out.printf("Monthly Payment: %.2f\n" , monthlyPayment);
		System.out.printf("Total Payment: %.2f\n" , totalPayment);
		
		//Getting the interest payment and the principal payment
		System.out.println("\nPayment#\tInterest\tPrincipal\tBalance");
		
		double balance = loan;
		double interestFee = 0;
		double principal   = 0;
		
		
		for (int i = 1; i <= years * 12; i++) {
			
			interestFee = monthlyInterest * balance;
			principal = monthlyPayment - interestFee;
			balance -= principal;
			System.out.printf("%-16s%-16s%-16s%-16s%n",
							  i,
							  String.format("%.2f", interestFee) ,
							  String.format("%.2f",principal) ,
							  String.format("%.2f",balance) );
			
		}
		
	}
	
public static double monthlyPayment(double loanAmount, double monthlyInterest, int numberOfYears) {
		
		double mpayment = loanAmount * monthlyInterest / (1 - 1 / Math.pow(1 + monthlyInterest, numberOfYears * 12));
		
		return mpayment;
	}

}
