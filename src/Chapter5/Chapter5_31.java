package Chapter5;
/*
 * Financial: credit card number validation
 * Credit card numbers follow certain patterns. A credit card number must have between 13 and 16 digits. 
 * It must start with :
 * 
 * 4 for Visa cards
 * 5 for Master cards
 * 37 for American Express cards
 * 6 for Discover cards
 * 
 * In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card numbers. The algorithm is useful
 * to determine whether a card number is entered correctly or whether a credit card is scanned correctly by a
 * scanner. Credit card numbers are generated following this validity check, commonly known as the Luhn check 
 * or the Mod 10 check, which can be described as follows (textbook e.g. 4388576018402626):
 * 
 * ......
 * 
 * Write a program that prompts the user to enter a credit card number as a long integer. Display whether the
 * number is valid or invalid. Design your program to use the following methods (shown in textbook)
 */
import java.util.Scanner;

public class Chapter5_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		long ccNumber = input.nextLong();
		
		input.close();
		
		if (isValid(ccNumber)) 
			System.out.println(ccNumber + " is valid.");
		else
			System.out.println(ccNumber + " is invalid.");
		
	}
	
	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		
		if (getSize(number) >= 13 &&
			getSize(number) <= 16 &&
			(prefixMatched(number, 4) ||
			prefixMatched(number, 5) ||
			prefixMatched(number, 37) ||
			prefixMatched(number, 6)) &&
			(sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0)
			return true;
		else
			return false;
	}
	
	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		
		for (int digit = 0; number >= 10; number /= 100) {
			digit = (int) (number % 100);
			digit /= 10;
			digit *= 2;
			
			sum += getDigit(digit);						
		}
		
		return sum;
	}
	
	/** Return this number if it is a single digit, otherwise, 
	 * return the sum of the two digits */
	public static int getDigit(int number) {
		
		if (number < 9)
			return number;
		
		return number / 10 + number % 10;
			
	}
	
	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		
		for (int digit = 0; number > 0; number /= 100) {
			digit = (int) (number % 10);
			
			sum += getDigit(digit);
		}
		
		return sum;
	}
	
	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		
		return getPrefix(number, getSize(d)) == d;
	}
	
	/** Return the number of digits in d */
	public static int getSize(long d) {
		return Long.toString(d).length();
	}
	
	/** Return the first k number of digits from number. If the 
	 * number of digits in number is less than k, return number */
	public static long getPrefix(long number, int k) {
		
		if (getSize(number) > k) {
			String num = number + "";
			return Long.parseLong(num.substring(0, k));
		}
		
		return number;
	}

}
