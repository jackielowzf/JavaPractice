package Chapter4;
/*
 * Chapter 4.41
 * Occurrence of max number.
 * Program will read integers, find the largest of them, and counts its occurrences.
 * Assume that the input ends with number 0. Suppose that you entered 3 5 2 5 5 5 0;
 * the program finds that the largest is 5 and the occurrence count for 5 is 4.
 * 
 * (Hint: Maintain two variables, max and count. max stores the current max number, and count 
 * stores its occurences. Initially, assign the first number to max and 1 to count. Compare
 * each subsequent number with max. If the number is greater than max, assign it to max and 
 * reset count to 1. If the number is equal to max, increment count by 1.)
 */
import java.util.Scanner;

public class Chapter4_41 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int max = 0; int count = 0;
		
		//Asks the user for numbers. 0 will end the input sequence.
		System.out.println("Enter numbers, 0 will end the sequence: ");
		int number = input.nextInt();
		
		while(number != 0) {
			
			if (number > max) {
				count = 1;
				max = number;
			}
			else if (number == max)
				count++;
			
			number = input.nextInt();
		}
		input.close();
		
		System.out.println("The largest number is " + max + 
				". The occurrence count of the largest number is is " + count);
			
	}

}
