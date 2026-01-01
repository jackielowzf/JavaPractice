package Chapter6;
/*
 * Chapter 6.19
 * Sorted?
 * Write the following method that returns true if the lsit is already sorted in increasing order.
 * 
 * public static boolean isSorted(int[] list)
 * 
 * Write a test program that prompts the user to enter a list and displays whether the list is sorted or not. 
 * Sample run(textbook). Note that the first number in the input indicates the number of the elements in the list.
 */
import java.util.Arrays;

public class Chapter6_19 {
	public static void main(String[] args) {
		int[] list1 = {8, 10, 1, 5, 16, 61, 9, 11, 1};
		int[] list2 = {10, 1, 1, 3, 4, 4, 5, 7, 9, 11, 21};
		
		printArray(list1);
		printArray(list2);
	}
	
	public static boolean isSorted(int[] array) {
		int[] tempCopy =  new int[array.length - 1];
		System.arraycopy(array, 1, tempCopy, 0, array.length - 1);
				
		int[] tempSorted = new int[tempCopy.length];
		System.arraycopy(tempCopy,  0, tempSorted, 0, tempCopy.length);
		Arrays.sort(tempSorted);
				
		if(Arrays.equals(tempCopy, tempSorted))
			return true;
		
		
		return false;
	}
	
	public static void printArray(int[] array) {
		if (isSorted(array)) {
			System.out.println(Arrays.toString(array) + "\nThe list is already sorted");
		}
		else 
			System.out.println(Arrays.toString(array) + "\nThe list is not sorted");
	}

}
