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
		String[][] test1 = {{"A", "B", "C", "D"},
							{"B", "A", "D", "C"},
							{"C", "D", "B", "A"},
							{"D", "C", "A", "B"}};
		
		String[][] test2 = {{"A", "F", "D"}};
		
		printResults(test1);
		printResults(test2);
	}
	
	public static void printResults(String[][] m) {
		
		if (isValidLatinSquare(m)) {
			System.out.println("The input array is a Latin square");
		}
		else
			System.out.println("Wrong input: the letters must be from A to C");
		
	}
	
	public static boolean isValidLatinSquare(String[][] m) {
		
		
		return false;
	}

}
