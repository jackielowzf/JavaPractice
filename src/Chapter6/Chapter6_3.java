package Chapter6;
/*
 * Count occurrence of numbers
 * Write a program that reads the integers between 1 and 100 and counts the
 * occurrences of each. Assume the input ends with 0. Here is a sample run (in textbook)
 * 
 * Note that if a number occurs more than one time, the plural word times is used in the output.
 */
import java.util.Scanner;

public class Chapter6_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[100];
		int i = 0;
				
		System.out.println("Enter the integers between 1 and 100: ");
		do {
			i = input.nextInt();
			if (i >= 1 && i <= 100) {
				numbers[i - 1]++;
			}
		}while (i != 0);
		
		input.close();
		
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] != 0) {
				if (numbers[j] == 1)
				System.out.println((j + 1) + " occurs " + numbers[j] + " time");
				else
				System.out.println((j + 1) + " occurs " + numbers[j] + " times");
			}
		}
		
	}

}
