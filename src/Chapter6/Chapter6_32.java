package Chapter6;
/*
 * Chapter 6.32
 * (Partition of a list) Write the following method that partitions the list using the
first element, called a pivot.
public static int partition(int[] list)
After the partition, the elements in the list are rearranged so that all the elements
before the pivot are less than or equal to the pivot and the elements after the pivot
are greater than the pivot. The method returns the index where the pivot is located
in the new list. For example, suppose the list is . After the parti-
tion, the list becomes . Implement the method in a way that takes
list.length comparisons. Write a test program that prompts the user to enter
a list and displays the list after the partition. Here is a sample run. Note that the
first number in the input indicates the number of the elements in the list.
 */
public class Chapter6_32 {
	public static void main(String args[]) {
		int[] list = {10, 1, 5, 16, 61, 9, 11, 1};
		
		sort(list, partition(list));
		printArray(list);
	}
	
	public static void printArray(int[] m) {
		
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + " ");
		}
	}
		
	public static int partition(int[] list) {
				
		return list.length / 2;
	}
	
	public static void sort(int[] list, int pivotIndex) {
		int pivot = list[0];
		int temp = list[0];
		
		list[0] = list[pivotIndex];
		list[pivotIndex] = temp;
		
		for (int i = 0; i < pivotIndex; i++) {
			
			if (list[i] > pivot) {
				temp = list[i];
				boolean swap = true;
				
				for (int j = pivotIndex + 1; j < list.length && swap; j++) {
					
					if (list[j] < pivot) {
						list[i] = list[j];
						list[j] = temp;
						swap = false;
					}
				}
			}
		}
	}

}
