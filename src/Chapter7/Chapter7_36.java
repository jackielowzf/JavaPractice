package Chapter7;
/*
 * Chapter 7.36
 * (Latin square) A Latin square is an n-by-n array filled with n different Latin let-
ters, each occurring exactly once in each row and once in each column. Write a
program that prompts the user to enter the number n and the array of characters, as
shown in the sample output, and checks if the input array is a Latin square. The
characters are the first n characters starting from A

Enter number n:
Enter 4 rows of letters separated by spaces:
The input array is a Latin square
D C A B
C D B A
B A D C
A B C D

Enter number n:
Enter 3 rows of letters separated by spaces:
Wrong input: the letters must be from A to C
A F D

 */
public class Chapter7_36 {
	public static void main(String args[]) {
		int n1 = 4; 
		int n2 = 3;
		char[][] test1 = {{'A', 'B', 'C', 'D'},
							{'B', 'A', 'D', 'C'},
							{'C', 'D', 'B', 'A'},
							{'D', 'C', 'A', 'B'}};
		
		char[][] test2 = {{'A', 'F', 'D'}};
		
		printResults(test1, n1);
		printResults(test2, n2);
		
	}
	
	public static void printResults(char[][] m, int n) {
		char limit = (char)('A' + n - 1);
		
		if (isValidLatinSquare(m, n)) {
			System.out.println("The input array is a Latin square");
		}
		else
			System.out.println("Wrong input: the letters must be from A to " + limit);
		
	}
	
	public static boolean isValidLatinSquare(char[][] m, int n) {
		char[] compare = new char[n];
		int row = m.length;
		int column = m[0].length;
		
		//Check each row
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				
				//Check if element is unique or an invalid input
				if(!isUnique(compare, m[i][j]) ||
					m[i][j] >= ('A' + n)) {
					return false;
				}
			}
			resetArray(compare);
		}
		
		//Check each column
		for (int j = 0; j < column; j++) {
			for (int i = 0; i < row; i++) {
				
				//Check if element is unique or an invalid input
				if(!isUnique(compare, m[i][j]) ||
					m[i][j] >= ('A' + n)) {
					return false;
				}
			}
			resetArray(compare);
		}
		
		return true;
	}
	
	public static boolean isUnique(char[] m, char letter) {
		
		for (int i = 0; i < m.length; i++) {
			
			if (m[i] == 0) {
				m[i] = letter;
				return true;
			}
			
			if (m[i] == letter) {
				return false;
			}
		}
		
		return false;
	}
	
	public static void resetArray(char[] m) {
		
		for (int i = 0; i < m.length; i++) {
			m[i] = 0;
		}
	}

}
