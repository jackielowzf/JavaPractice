package chapter8;
import java.util.Scanner;
/*
 * Chapter 8.13
 * (The Location class) Design a class named Location for locating a maximal
value and its location in a two-dimensional array. The class contains public data
fields row, column, and maxValue that store the maximal value and its indices in
a two-dimensional array with row and column as int types and maxValue as a
double type.
Write the following method that returns the location of the largest element in a
two-dimensional array:
public static Location locateLargest(double[][] a)
*8.14 (Stopwatch) Design a class named StopWatch. The class contains:
■ Private data fields startTime and endTime with get methods.
■ A no-arg constructor that initializes startTime with the current time.
■ A method named start() that resets the startTime to the current time.
■ A method named stop() that sets the endTime to the current time.
■ A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.
Draw the UML diagram for the class and then implement the class. Write a test
program that measures the execution time of sorting 100,000 numbers using selec-
tion sort.
Enter the number of rows and columns in the array:
Enter the array:
The location of the largest element is 45 at (1, 2)
35 44 5.5 9.6
4.5 3 45 3.5
23.5 35 2 10
3 4
The return value is an instance of Location. Write a test program that prompts
the user to enter a two-dimensional array and displays the location of the largest
element in the array. Here is a sample run:
 */
public class Chapter8_13 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter row and column: ");
		int row = input.nextInt();
		int column = input.nextInt();
		
		double[][] m = new double[row][column];
		
		System.out.println("Enter the array: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		
		input.close();
		
		Location location = Location.locateLargest(m);
		
		System.out.println("Location of the largest element is " + 
							location.maxValue + " at (" +
							location.row + ", " + location.column + ")");
	}

}

class Location{
	public int row = 0, column = 0;
	public double maxValue = 0;
	
	public Location() {
	}
	
	public static Location locateLargest(double[][] a) {
		int maxRow = 0, maxColumn = 0;
		double maxValue = a[0][0];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				if (a[i][j] > maxValue) {
					maxValue = a[i][j];
					maxRow = i;
					maxColumn = j;
				}
			}
		}
		
		Location result = new Location();
		result.row = maxRow;
		result.column = maxColumn;
		result.maxValue = maxValue;
		
		return result;
	}
	
	
	
	
	
}
