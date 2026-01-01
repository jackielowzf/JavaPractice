package Chapter6;
/*
 * Chapter 6.18
 * Bubble sort
 * Write a sort method that uses the bubble-sort algorithm. The bubble sort algorithm makes several passes through the array. 
 * On each pass, successive neighboring pairs are compared. If a pair is not in order, its values are swapped; otherwise, their
 * values remain unchanged. The technique is called a bubble sort or sinking sort because the smaller values gradually "bubble"
 * their way to the top and the larger values "sink" to the bottom. Write a test program that reads in ten double numbers, 
 * invokes the method, and displays the sorted numbers.
 */
import java.util.Arrays;

public class Chapter6_18 {
	public static void main(String[] args) {
		int[] list = {8, 10, 1, 5, 16, 61, 9, 11, 1};
		
		int[] sortedList = bubbleSort(list);
		printArray(sortedList);
	}
	
	public static int[] bubbleSort(int[] array) {
		int temp = 0;
		
		for(int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] < array[i]) {
				temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
				
				//reset iteration to pass through the array again
				i = -1;
			}
		}
		return array;
	}
	
	public static void printArray(int[] array) {
			System.out.println(Arrays.toString(array));
	}

}
