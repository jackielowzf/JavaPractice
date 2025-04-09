package Chapter5;
/*
 * Math: approximate the square root
 * There are several techniques for implementing the sqrt method in the Math class.
 * One such technique is known as the Babylonian method. It approximates the square root of a number, n,
 * by repeatedly performing a calculation using the following formula:
 * 
 * nextGuess = (lastGuess + n / lastGuess) / 2
 * 
 * When nextGuess and lastGuess are almost identical, nextGuess is the approximated square root.
 * The initial guess can be any positive value (e.g., 1). This value will be starting value for lastGuess. 
 * If the difference between nextGuess and lastGuess is less than a very small number, such as 0.0001, 
 * you can claim that nextGuess is the approximated square root of n. If not, nextGuess becomes lastGuess and 
 * the approximation process continues. Implement the following method that returns the square root of n. 
 * 
 * public static double sqrt(long n)
 */
import java.util.Scanner;

public class Chapter5_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number to perform square root function on: ");
		long n = input.nextLong();
		
		double result = sqrt(n);
		input.close();
		
		
		System.out.println("The approximate square root of " + n + " is " + result);
	}
	
	public static double sqrt(long n) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Guess the square root of " + n + ": ");
		double lastGuess = input.nextDouble();
		input.close();
		double nextGuess = 0.0;
		
		nextGuess = (lastGuess + n / lastGuess) / 2;
		
		while (Math.abs(nextGuess - lastGuess) > 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		
		
		return nextGuess;
	}

}
