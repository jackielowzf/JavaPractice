package Chapter3;
/*
 * Geometry: two circles. Program will prompt the user to enter the center coordinates and radii of two circles and 
 * determines whether the circle is inside the first or overlaps with the first. (Hint: circle2 is inside circle1 if
 * distance between the two centers <= |r1 - r2| and ricle 2 overlaps circle if distance between two centers <= r1+r2.
 */
import java.util.Scanner;

public class Chapter3_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		//Asks user to enter coordinates and radii for two circles
		System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
		double cX1 = input.nextDouble();
		double cY1 = input.nextDouble();
		double r1  = input.nextDouble();
		
		System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");
		double cX2 = input.nextDouble();
		double cY2 = input.nextDouble();
		double r2  = input.nextDouble();
		
		input.close();
		
		//Call to function to check for distance and check if inside or overlapping
		double centerDistance = distance(cX1, cY1, cX2, cY2);
		
		if (centerDistance <= Math.abs(r1-r2) )
			System.out.println("circle2 is inside circle1");
		else if (centerDistance <= r1 + r2)
			System.out.println("circle2 overlaps circle1");
		else
			System.out.println("circle2 does not overlap circle1");
			
		
	}
	
	public static double distance(double cX1, double cY1, double cX2, double cY2) {
		
		double distance = Math.pow(Math.pow(cX2 - cX1, 2) + Math.pow(cY2 - cY1, 2) , 0.5);
				
		return distance;
	}

}
