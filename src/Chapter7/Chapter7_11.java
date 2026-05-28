package Chapter7;
import java.util.Scanner;
/*
 * (Game: nine heads and tails) Nine coins are placed in a 3-by-3 matrix with some
face up and some face down. You can represent the state of the coins using a 3-by-
3 matrix with values 0 (heads) and 1 (tails). Here are some examples:
0 0 0 1 0 1 1 1 0 1 0 1 1 0 0
0 1 0 0 0 1 1 0 0 1 1 0 1 1 1
0 0 0 1 0 0 0 0 1 1 0 0 1 1 0
Programming Exercises 285
Each state can also be represented using a binary number. For example, the pre-
ceding matrices correspond to the numbers
000010000 101001100 110100001 101110100 100111110
There are a total of 512 possibilities, so you can use decimal numbers 0, 1, 2,
3, . . . , and 511 to represent all states of the matrix. Write a program that prompts
the user to enter a number between 0 and 511 and displays the corresponding
matrix with the characters H and T. Here is a sample run:
 */
public class Chapter7_11 {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 511: ");
		int num = input.nextInt();
		
		input.close();
		
		int[][] m = decimalToMatrix(num);
		
		printArray(m);
		
	}
	
	public static void printArray(int[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1) {
					System.out.print("T ");					
				}else
					System.out.print("H ");
			}
			System.out.println("");
		}
	}
	
	public static int[] decimalToBinary(int num) {
		
		//Creating and assigning binary array size
		int[] binary = new int[9];
		int id = 0;
		
		while (num > 0) {
			binary[id++] = num % 2;
			num = num / 2;
		}
		
		//Reversing the order to get binary
		int[] temp = new int[9];
		for (int i = 0; i < 9; i++) 
			temp[i] = binary[9 - i - 1];
		
		for (int i = 0; i < 9; i++)
			binary[i] = temp[i];
				
		return binary;
	}
	
	public static int[][] decimalToMatrix(int num) {
		
		int[] binary = decimalToBinary(num);
		
		int[][] matrix = new int[3][3];
		int id = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = binary[id];
				id++;
			}
		}
		
		return matrix;
	}

}
