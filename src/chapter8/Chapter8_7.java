package chapter8;
import java.util.Date;
/*
 * Chapter 8.7
 * (The Account class) Design a class named Account that contains:
■ A private int data field named id for the account (default 0).
■ A private double data field named balance for the account (default 0).
■ A private double data field named annualInterestRate that stores the
current interest rate (default 0). Assume all accounts have the same interest rate.
■ A private Date data field named dateCreated that stores the date when the
account was created.
■ A no-arg constructor that creates a default account.
■ A constructor that creates an account with the specified id and initial balance.
■ The accessor and mutator methods for id, balance, and
annualInterestRate.
■ The accessor method for dateCreated.
■ A method named getMonthlyInterestRate() that returns the monthly
interest rate.
■ A method named getMonthlyInterest() that returns the monthly interest.
■ A method named withdraw that withdraws a specified amount from the
account.
■ A method named deposit that deposits a specified amount to the account.
Draw the UML diagram for the class and then implement the class. (Hint: The method
getMonthlyInterest() is to return monthly interest, not the interest rate. Monthly
interest is balance * monthlyInterestRate. monthlyInterestRate is
annualInterestRate / 12. Note that annualInterestRate is a percentage,
e.g.,like 4.5%. You need to divide it by 100.)
Write a test program that creates an Account object with an account ID of 1122,
a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
method to withdraw $2,500, use the deposit method to deposit $3,000, and print
the balance, the monthly interest, and the date when this account was created.
 */
public class Chapter8_7 {
	public static void main(String args[]) {
		Account account1 = new Account(1122, 20000, 4.5);
		System.out.println(account1.getId() + "\n" + account1.getBalance() + "\n" + account1.getAnnualInterestRate());
		account1.withdraw(2500);
		account1.deposit(3000);
		
		System.out.println("Your balance is: " + account1.getBalance() + "\n" +
						   "Your monthly interest rate is: " + account1.getMonthlyInterest() + "\n" +
						   "Your account was created on: " + account1.getDateCreated());
	}

}

class Account{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	
	Account(){
		dateCreated = new Date();
	}
	
	Account(int newId, double newBalance, double newAnnualInterestRate){
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
		dateCreated = new Date();
	}
	
	int getId() {
		return id;
	}
	
	void setId(int newId) {
		this.id = newId;
	}
	
	double getBalance() {
		return balance;
	}
	
	void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	
	double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	void setAnnualInterestRate(double newAnnualInterestRate) {
		this.annualInterestRate = newAnnualInterestRate;
	}
	
	Date getDateCreated() {
		Date startDate = dateCreated;
		
		return startDate;
	}
	
	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}
	
	void withdraw(double withdrawAmount) {
		balance -= withdrawAmount;
		System.out.println("Withdrawal amount: " + withdrawAmount + "\n" +
							"Your balance is now: " + balance);
	}
	
	void deposit(double depositAmount) {
		balance += depositAmount;
		System.out.println("Deposit amount: " + depositAmount + "\n" +
							"Your balance is now: " + depositAmount);
	}
	
	
}
