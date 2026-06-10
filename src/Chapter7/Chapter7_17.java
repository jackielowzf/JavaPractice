package Chapter7;
import java.util.Scanner;
import java.util.Arrays;

/*
 * (Financial tsunami) Banks lend money to each other. In tough economic times, if a bank goes bankrupt, 
 * it may not be albe to pay back the loan. A bank's total assets are its current balance plus its loans to 
 * other banks. The diagram in Figure 7.8 shows five banks. The banks' current balances are 25, 125, 175, 75, and 
 * 181 million dollars, respectively. The directed edge from node 1 to node 2 indicates that bank 1 lends 40 million 
 * dollars to banks 2. If a bank's total assets. Consequently, the lender may also be unsafe, if its total assets
 * are under the limit. Write a program to find all the unsafe banks. Your program reads the input as follows.
 * It first reads two integers n and limit, where n indicates the number of banks and limit is the minimum
 * total assets for keeping a bank safe. It then reads n lines that describe the information for n banks with ID.
 * form 0 to n-1. 
 * 
 * The first number in the line is the bank's balance, the second number indicates the number of banks that borrowed
 * money from the bank, and the rest are pairs of two numbers. Each pair describes a borrower. The first number
 * in the pair is the borrower's ID and the second is the amount borrowed. For example, the input for the five banks
 * in Figure 7.8 is as follows (note that the limit is 201):
 * 
 * 5 201
 * 25 2 1 100.5 4 320.5
 * 125 2 2 40 3 85
 * 175 2 0 125 3 75
 * 75 1 0 125
 * 181 1 2 125
 * 
 * The total assets of bank 3 are (75 + 125), which is under 201, so bank 3 is unsafe. After  bank 3 becomes unsafe, the
 * total assets of bank 1 fall below (125 + 40). Thus, bank 1 is also unsafe. The output of the program should be 
 * 
 * Unsafe banks are 3 1
 * 
 * (Hint: Use a two-dimensional array borrowers to represent loans.borrowers[i][j] indicates the loan that bank i loans to 
 * bank j. Once bank j becomes unsafe, borrowers[i][j] should be set to 0.)
 */
public class Chapter7_17 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of banks: ");
		int bank = input.nextInt();
		
		System.out.println("Enter minimum assets: ");
		double minAsset = input.nextInt();
		
		double[] balance = new double[bank];
		double[][] borrowers = new double[bank][bank];
		
		for (int i = 0; i < bank; i++) {
			System.out.println("Enter bank " + i + "'s balance: ");
			balance[i] = input.nextDouble();
			
			System.out.println("Enter number of banks to loan to: ");
			int num = input.nextInt();
			
			for (int j = 0; j < num; j++) {
				System.out.println("Enter the borrower's bank number: ");
				int id = input.nextInt();
				
				System.out.println("Enter the loan amount: ");
				double loan = input.nextDouble();
				
				borrowers[i][id] = loan;
			}
		}
		
		input.close();
		//Check which banks are unsafe
		checkUnsafe(balance, borrowers, minAsset);
		printUnsafe(balance, borrowers, minAsset);
	}
	
	public static void checkUnsafe(double[] balance, double[][] borrowers, double minAsset) {
		double asset = 0;
		double[][] copy = new double[borrowers.length][borrowers[0].length];
		
		do {
			//copy contents of borrowers to "copy" for later comparison
			for (int h = 0; h < borrowers.length; h++) {
				copy[h] = borrowers[h].clone();
			}
			
			for (int i = 0; i < balance.length; i++) {
			
				// Calculate total loan amount
				for (int j = 0; j < borrowers[i].length; j++) {
				
					asset += borrowers[i][j];
				}
			
				// Check if total asset is under minimum assets
				if ((balance[i] + asset) < minAsset) {
					for (int k = 0; k < borrowers.length; k++)
						borrowers[k][i] = 0;
				}
			
				asset = 0;				
			}
		}while (!Arrays.deepEquals(borrowers, copy));
	}
	
	public static void printUnsafe(double[] balance, double[][] borrowers, double minAsset) {
		double asset = 0;
		
		for (int i = 0; i < balance.length; i++) {
			
			// Calculate total loan amount
			for (int j = 0; j < borrowers[i].length; j++) {
			
				asset += borrowers[i][j];
			}
		
			// Check if total asset is under minimum assets
			if ((balance[i] + asset) < minAsset) {
				System.out.println("Bank " + i + " is unsafe.");
			}
		
			asset = 0;				
		}
		
	}

}
