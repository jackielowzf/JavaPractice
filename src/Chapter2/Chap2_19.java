/* Problem 2.19
 * Geometry: Distance of two points. Prompts user to enter two coordinates and displays 
 * distance between them. Objective of this problem is to use Math.pow and calling it as
 * a function outside of main
 */

import java.util.Scanner;


public class Chap2_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Asks user for x1,x2 and y1,y2
		System.out.println("Enter x1 and y1 (e.g 1.5 -3.4): ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.println("Enter x2 and y2 (e.g 4 5): ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		// Calculate dx and dy and call to function
		double dx = x2 - x1;
		double dy = y2 - y1;
		
		double distance = distance(dx , dy);
		
		// Display Result
		System.out.printf("The distance between the two points is: %2.4f" , distance);
		
		
	}



/*Distance Method*/
public static double distance(double dx, double dy) {
	double distance;
	
	distance = Math.pow(Math.pow(dx, 2) + Math.pow(dy, 2) , 0.5);
	
	return distance;
}



}
