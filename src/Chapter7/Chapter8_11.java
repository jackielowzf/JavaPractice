package Chapter7;
/*
 * Chapter 8.11
 * (Algebra: linear equations) Design a class named LinearEquation for a
system of linear equations:
The class contains:
■ Private data fields a, b, c, d, e, and f.
■ A constructor with the arguments for a, b, c, d, e, and f.
■ Six get methods for a, b, c, d, e, and f.
■ A method named isSolvable() that returns true if is not 0.
■ Methods getX() and getY() that return the solution for the equation.
Draw the UML diagram for the class and then implement the class. Write a test
program that prompts the user to enter a, b, c, d, e, and f and displays the result.
If is 0, report that “The equation has no solution.” See Programming
Exercise 3.3 for sample runs
 */
public class Chapter8_11 {
	public static void main(String args[]) {
		LinearEquation equation1 = new LinearEquation(9.0, 4.0, 3.0, -5.0, -6.0, -21.0);
		printSolution(equation1);
		
		LinearEquation equation2 = new LinearEquation(1.0, 2.0, 2.0, 4.0, 4.0, 5.0);
		printSolution(equation2);
	}
	
	public static void printSolution(LinearEquation equation) {
		if (equation.isSolvable())
			System.out.println("x is " + equation.getX() + " y is " + equation.getY());
		else
			System.out.println("The equation has no solution");
	}

}

class LinearEquation{
	private double a, b, c, d, e, f;
	
	LinearEquation(double a, double b, double c, double d, double e, double f){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	double getA() {
		return a;
	}
	
	double getB() {
		return b;
	}
	
	double getC() {
		return c;
	}
	
	double getD() {
		return d;
	}
	
	double getE() {
		return e;
	}
	
	double getF() {
		return f;
	}
	
	boolean isSolvable() {
		if ((a * d) - (b * c) == 0)
			return false;
		else 
			return true;
	}
	
	double getX() {
		return ((e * d) - (b * f)) / ((a * d) - (b * c));
	}
	
	double getY() {
		return ((a * f) - (e * c)) / ((a * d) - (b * c));
	}
}
