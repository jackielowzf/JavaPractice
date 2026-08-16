package Chapter7;
/*
 * Chapter 8.10
 * (Algebra: quadratic equations) Design a class named QuadraticEquation for a
quadratic equation The class contains:
■ Private data fields a, b, and c that represent three coefficients.
■ A constructor for the arguments for a, b, and c.
ax 2 + bx + x = 0.
Area = n * s2
4 * tan¢ p
n ≤
■ Three get methods for a, b, and c.
■ A method named getDiscriminant() that returns the discriminant, which is
■ The methods named getRoot1() and getRoot2() for returning two roots of
the equation
These methods are useful only if the discriminant is nonnegative. Let these meth-
ods return 0 if the discriminant is negative.
Draw the UML diagram for the class and then implement the class. Write a test
program that prompts the user to enter values for a, b, and c and displays the result
based on the discriminant. If the discriminant is positive, display the two roots. If
the discriminant is 0, display the one root. Otherwise, display “The equation has
no roots.” See Programming Exercise 3.1 for sample runs
 */
public class Chapter8_10 {
	public static void main(String args[]) {
		QuadraticEquation equation1 = new QuadraticEquation(1.0, 3, 1);
		printRoot(equation1);
		
		QuadraticEquation equation2 = new QuadraticEquation(1, 2.0, 1);
		printRoot(equation2);
		
		QuadraticEquation equation3 = new QuadraticEquation(1, 2, 3);
		printRoot(equation3);
	}
	
	public static void printRoot(QuadraticEquation equation) {
		if (equation.getDiscriminant() > 0)
			System.out.println("The roots are " + equation.getRoot1() + " and " + equation.getRoot2());
		else if (equation.getDiscriminant() == 0)
			System.out.println("The root is " + equation.getRoot1());
		else
			System.out.println("The equation has no real roots");
	}

}

class QuadraticEquation{
	private double a, b, c;
	
	QuadraticEquation(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
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
	
	double getDiscriminant() {
		return Math.pow(b, 2) - (4 * a * c);
		
	}
	
	double getRoot1() {
		return ((-1 * b) + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
	}
	
	double getRoot2() {
		return ((-1 * b) - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
	}
	
}
