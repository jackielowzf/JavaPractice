package Chapter5;
/*
 * Palindromic prime
 * A palindromic prime is a prime number and also palindromic. For example, 131 is a prime and also a palindromic prime, as are 313 
 * and 757. Write a program that displays the first 100 palindromic prime numbers. Display 10 numbers per line, 
 * separated by exactly one space, as follows (in textbook):
 */
public class Chapter5_26 {
	public static void main(String[] args) {
		int numberOfOutput = 100, printCounter = 0, printPerLine = 0;
	
		int number = 2;
		
		while (printCounter < numberOfOutput) {
			//print 10 results per line
			while (printPerLine < 10) {
				//Check if number is prime
				for (int divider = 2; divider <= number / 2; divider++) {
					if (number % divider == 0) {
						number++;
						divider = 2;
					}
				}
		
				if (isPalindrome(number)) {
					System.out.print(number + " ");
					number++;
					printPerLine++;
					printCounter++;
				}
				else
					number++;
		
			}
			
			System.out.print("\n");
			printPerLine = 0;
		}
	}	
	
	
	public static boolean isPalindrome(int number) {
		
		int digit = 0, reversed = 0, testNumber = number;
		
		while (testNumber > 0) {
			digit = testNumber % 10;
			reversed = reversed * 10 + digit;
			testNumber /= 10;
		}
		
		if (number == reversed) {
			return true;
		}
		else
			return false;
	}

}
