package Chapter4;
/*
 * Chapter 4.33
 * Perfect Number. A positive integer is called a perfect number if it is equal to the 
 * sum of all its positive divisors, excluding itself. E.g. 6 is the first perfect number
 * 6 = 3 + 2 + 1. Next is 28 = 14 + 7 + 4 + 2 + 1. There are four perfect numbers less
 * than 10,000. Write a program that finds all 4 perfect number. 
 */
public class Chapter4_33 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 10000; i++) {
			
			//Find the divisors
			for (int a = 1; a <= i/2; a++) {				
				if (i % a == 0)
					sum += a;		
			}
			
			if (sum == i)
				System.out.println("Perfect number found! It is: " + i);
			sum = 0;
		}
	}

}
