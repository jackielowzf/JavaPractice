package Chapter3;

/*
 * Chapter 3.23
 * Geometry: point in a rectangle? Write a program that prompts user to enter a coordinate (x, y)
 * and checks whether point is within rectangle centered at (0, 0) with width 10 and height 5. 
 */
import java.util.Scanner;

public class Chap3_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Asks user for coordinates
		System.out.println("Enter a point with two coordinates (e.g. 2 2): ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		//Call to function and check if it's inside rectangle
		double lengthX = distance(x);
		double lengthY = distance(y);
		
		input.close();
		
		if (lengthX <= 5 && lengthY <= 2.5)
			System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
		else
			System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
		
	}
	
	public static double distance(double point) {
		
		double length = Math.abs(point);
		return length;
	}
	

}
