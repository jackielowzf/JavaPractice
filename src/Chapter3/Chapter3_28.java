package Chapter3;
/*
 * Chapter 3.28
 * Geometry: Two rectangles. Program will prompt user to enter a center point (x,y), width and height
 * of two rectangles and determine whether the second rectangle is inside the first or
 * overlaps with the first. Test cases are: inside, overlap, not overlapping
 */
import java.util.Scanner;

public class Chapter3_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt user for first rectangle
		System.out.println("Enter r1's center x-, y-coordinates, width, and height " +
							"(e.g. 2.5 4 2.5 43): ");
		double r1X = input.nextDouble();
		double r1Y = input.nextDouble();
		double r1W = input.nextDouble();
		double r1H = input.nextDouble();
		
		//Prompt user for second rectangle
		System.out.println("Enter r2's center x-, y-coordinates, width, and height " +
				"(e.g. 2.5 4 2.5 43): ");
		double r2X = input.nextDouble();
		double r2Y = input.nextDouble();
		double r2W = input.nextDouble();
		double r2H = input.nextDouble();
		
		input.close();
		
		//Call to function to get boolean checks to see if overlapping or inside rectangle
		boolean lower = true;
		boolean lowerRX = check(lower, r2X, r2W, r1X, r1W);
		boolean lowerRY = check(lower, r2Y, r2H, r1Y, r1H);
		
		lower = false;
		boolean higherRX = check(lower, r2X, r2W, r1X, r1W);
		boolean higherRY = check(lower, r2Y, r2H, r1Y, r1H);
		
		if (lowerRX && lowerRY && higherRX && higherRY)
			System.out.println("r2 is inside r1");
		else if ( (Math.abs(r1X - r2X) <= r1W / 2 + r2W / 2)  && (Math.abs(r1Y - r2Y) <= r1H / 2 + r2Y / 2))
			System.out.println("r2 overlaps with r1");
		else 
			System.out.println("r2 does not overlap with r1");
		
	}
	
	public static boolean check(boolean lower, double r1C, double r1D, double r2C, double r2D) {
		boolean check = false;
		
		
		//Checking for lower bound or higher bound check
		if (lower) {
			if (r1C - r1D / 2 >= r2C - r2D / 2)
				check = true;
			else
				check = false;
		}
		else { 
			if (r1C + r1D / 2 <= r2C + r2D / 2)
				check = true;
			else
				check = false;
		}
		
		
		return check;
	}

}
