package Chapter6;
/*
 * Chapter 6.31
 * (Merge two sorted lists) Write the following method that merges two sorted lists
into a new sorted list.
public static int[] merge(int[] list1, int[] list2)
Implement the method in a way that takes list1.length + list2.length
comparisons. Write a test program that prompts the user to enter two sorted lists
and displays the merged list. Here is a sample run. Note that the first number in the
input indicates the number of the elements in the list.
 */
public class Chapter6_31 {
	public static void main(String args[]) {
		int[] list1 = {1, 5, 16, 61, 111};
		int[] list2 = {2, 4, 5, 6};
		
		printArray(merge(list1, list2));
	}
	
	public static int[] merge(int[] list1, int[] list2) {
		int[] m = new int[list1.length + list2.length];
		int i = 0;
		
		for (int j = 0; j < list1.length; i++, j++) {
			m[i] = list1[j];
		}
		
		for (int j = 0; j < list2.length; i++, j++) {
			m[i] = list2[j];
		}
		
		insertionSort(m);
		
		return m;
	}
	
	public static void insertionSort(int[] m) {
		for (int i = 0; i < m.length; i++) {
			int k;
			int currentElement = m[i];
			
			for (k = i - 1; k >= 0 && m[k] > currentElement; k--) {
				m[k + 1] = m[k];
			}
			
			m[k + 1] = currentElement;
		}
	}
	
	public static void printArray(int[] m) {
		
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + " ");
		}
	}

}
