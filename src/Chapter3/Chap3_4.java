package Chapter3;

/* Chapter 3.4 
 * Write a program that generates two integers under 100 and prompts the user to enter the sum of these two integers. 
 * Program reports true if answer is correct, else false
 */

import java.util.Scanner;
import java.util.Random;

public class Chap3_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		//Generate two random integers under 100
		int rand_Int1 = rand.nextInt(100);
		int rand_Int2 = rand.nextInt(100);
		
		//Asks user to enter the sum of the two integers
		System.out.println("What is the sum of " + rand_Int1 +
				" and " + rand_Int2 + "? ");
		int answer = input.nextInt();
		
		input.close();
		
		//Call to true/false function
		sum(rand_Int1, rand_Int2, answer);
		
		
	}
	
	/* True or False function*/
	public static void sum(int rand_Int1, int rand_Int2, int answer) {
		if (answer == rand_Int1 + rand_Int2)
			System.out.println("True");
		else
			System.out.println("False");
	}

}
