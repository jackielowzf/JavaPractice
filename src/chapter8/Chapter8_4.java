package chapter8;
import java.util.Random;
/*
 * Chapter 8.4
 * (Use the Random class) Write a program that creates a Random object with seed
1000 and displays the first 50 random integers between 0 and 100 using the
nextInt(100) method.
 */
public class Chapter8_4 {		
	public static void main(String args[]) {
		final int seed = 1000;
		Random rnd = new Random();
		rnd.setSeed(seed);
		
		for (int i  = 0; i < 10; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(rnd.nextInt(100) + " ");
			}
	        System.out.println();
		}
	}

}


