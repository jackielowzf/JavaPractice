package Chapter3;
/*
 * Chapter 3.27
 * Geometry: Point in a triangle. Right-angle point at (0,0)
 * Two other points at (200,0) and (0,100). Program will prompt
 * user to enter a point (x,y) and determines whether point is inside the triangle.
 */
import java.util.Scanner;

public class Chap3_27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Asks user input for 3 points to make a triangle
		System.out.println("Enter first coordinate of a triangle(e.g. 200 0): ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.println("Enter second coordinate of a triangle(e.g. 0 100): ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		System.out.println("Enter third coordinate of a triangle(e.g. 0 0): ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		
		System.out.println("Enter a coordinate to check if it is inside the triangle: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		input.close();
		
		//Call to function to get value m and b from line equation y = mx + b
		//line p1p2
		double m1 = slope(x1, y1, x2, y2);
		double b1 = YIntercept(m1, x1, y1);
		
		//line p2p3
		double m2 = slope(x2, y2, x3, y3);
		double b2 = YIntercept(m2, x2, y2);		
		
		//line p1p3
		double m3 = slope(x1, y1, x3, y3);
		double b3 = YIntercept(m3, x1, y1);
		
		
		
		//Call to function to check if point (x,y) is in triangle
		boolean boundaryCheck1 = aboveOrBelow(m1, x3, y3, x, y, b1);
		boolean boundaryCheck2 = aboveOrBelow(m2, x1, y1, x, y, b2);
		boolean boundaryCheck3 = aboveOrBelow(m3, x2, y2, x, y, b3);
		
		if (boundaryCheck1 && boundaryCheck2 && boundaryCheck3)
			System.out.println("The coordinate (" + x + " ," + y +
					") is in the triangle");
		else
			System.out.println("The coordinate (" + x + " ," + y +
					") is not in the triangle");
		
		
		
	}
	
	//Function to find value m from line equation y = mx + b using two points (x1,y2) and (x2,y2)
	public static double slope(double x1, double y1, double x2, double y2) {
		
		// Get slope from two points
		double slope = (y1 - y2) / (x1 - x2);
		
		return slope;		
	}
	
	
	//Function to find value b from line equation y = mx + b 
	public static double YIntercept(double m, double x, double y) {
		double b = y - m * x;
		
		return b;
	}

	public static boolean aboveOrBelow(double slope, double x3, double y3, double x, double y, double b) {
		boolean boundary = false;
		boolean check = false;
		
		//Compare to see if point is above the line
		if (y3 > x3 * slope + b)
			//Third point of the triangle is above the line
			boundary = true;
		else
			//Third point of the triangle is below the line
			boundary = false;
		
		if (boundary) {
			if (y < x * slope + b)
				// Returns that the input coordinate is outside the triangle
				check = false;
			else
				// Returns that the input coordinate is inside the triangle
				check = true;
		}
		else if (!boundary) {
			if (y > x * slope + b)
				// Returns that the input coordinate is outside the triangle
				check = false;
			else
				// Returns that the input coordinate is inside the triangle
				check = true;			
		}
		
		return check;
	}


}
