package Chapter6;
import java.util.Arrays;
/*
 * Chapter 6.5
 * Print distinct numbers
 * Write a program that reads in ten numbers and displays distinct numbers (i.e, if a number appears multiple times,
 * it is displayed only once). (Hint: Read a number and store it to an array if it is new. If the number is already in the array, ignore it.)
 * After the input, the array contains the distinct numbers. 
 */
import java.util.Scanner;

public class Chapter6_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 10 numbers: ");
		
		int[] tenNumbers = new int[10];
		int[] distinct   = new int[10];
		
		for (int i = 0; i < tenNumbers.length; i++) {
			tenNumbers[i] = input.nextInt();
		}
			
		input.close();
		
		int j = 0;
		Arrays.sort(tenNumbers);
		
		for(int i = 0; i < tenNumbers.length; i++) {
			if(!linearSearch(distinct, tenNumbers[i])) {
				distinct[j] = tenNumbers[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(distinct));
	}
	
	public static boolean linearSearch(int[] numbers, int key) {
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == key)
				return true;
		}
		return false;
	}
}
