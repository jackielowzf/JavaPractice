package Chapter6;
/*
 * Chapter 6.15
 * Eliminate duplicates
 * Write a method that returns a new array by eliminating the duplicate values in the array using the following method header:
 * 
 * public static int[] eliminateDuplicates(int[] list)
 * 
 * Write a test program that reads in ten integers, invokes the method, and displays the result. Here is sample(texbook)
 */
import java.util.Arrays;

public class Chapter6_15 {
	public static void main(String[] args) {
		int[] list = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
		
		int[] trimmedList = eliminateDuplicates(list);
		
		printArray(trimmedList);
		
		
	}
	
	public static int[] eliminateDuplicates(int[] list) {
		int[] distinct = new int[list.length];
		int index = 0;
		
		for (int i = 0; i < list.length; i++) {
			if (!linearSearch(distinct, list[i])) {
				distinct[index] = list[i];
				index++;
			}
		}
		
		int[] trimmedArray = new int[index];
		for(int i = 0; i < index; i++) {
			trimmedArray[i] = distinct[i];
		}
		
		return trimmedArray;
	}
	
	public static void printArray(int[] array) {
		
		System.out.println("The distinct numbers are: " + Arrays.toString(array));
		
	}
	
	public static boolean linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == key)
				return true;
		}
		
		return false;
	}

}
