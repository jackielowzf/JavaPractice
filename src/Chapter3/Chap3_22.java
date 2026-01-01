package Chapter3;

/*
 * Geometry: Point in a circle? Prompts user to enter a point (x,y) and 
 * checks whether the point is within a circle centered at (0,0) with 
 * radius 10. E.g. (4,5) is inside the circle; (9,9) is outside the circle.
 */
import java.util.Scanner;

public class Chap3_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Asks user for input 
		System.out.println("Enter a point with two coordinates (x,y) e.g 4 5: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		input.close();
		
		//Call to distance function
		double length = distance(x , y);
		
		//Check if coordinate is within circle:
		if (length <= 10) 
			System.out.println("Point (" + x + ", " + y + ") is in the circle");
		else 
			System.out.println("Point (" + x + ", " + y + ") is not in the circle");
	}
	
	public static double distance(double x, double y) {
		double length = 0;
				
		length = Math.pow(Math.pow(x, 2) + Math.pow(y ,  2) , 0.5);
		
		
		return length;
	}

}
