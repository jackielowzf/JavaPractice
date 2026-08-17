package Chapter7;
/*
 * Chapter 8.12
 * (Geometry: intersection) Suppose two line segments intersect. The two endpoints
for the first line segment are (x1, y1) and (x2, y2) and for the second line segment
are (x3, y3) and (x4, y4). Write a program that prompts the user to enter these four
endpoints and displays the intersecting point. (Hint: Use the LinearEquation
class in Exercise 8.11.)
 */
public class Chapter8_12 {
	public static void main(String args[]) {
		LineEquation equation1 = new LineEquation(2.0, 2.0, 0, 0);
		double a = equation1.getXCoefficient();
		double b = equation1.getYCoefficient();
		double e = equation1.getIntercept();
		
		LineEquation equation2 = new LineEquation(0, 2.0, 2.0, 0);
		double c = equation2.getXCoefficient();
		double d = equation2.getYCoefficient();
		double f = equation2.getIntercept();
		
		LinearEquation test1 = new LinearEquation(a, b, c, d, e, f);
		printSolution(test1);
		
	}
	
	public static void printSolution(LinearEquation equation) {
		if (equation.isSolvable())
			System.out.println("x is " + equation.getX() + " y is " + equation.getY());
		else
			System.out.println("The equation has no solution");
	}

}

class LineEquation{
	private double x1, y1, x2, y2;
	
	LineEquation(double x1, double y1, double x2, double y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public double getM() {
		return (x2 - x1) / (y2 - y1);
	}
	
	public double getXCoefficient() {
		return -1 * getM();
	}
	
	public double getYCoefficient() {
		return 1;
	}
	
	public double getIntercept() {
		return y1 - (getM() * x1);
	}
}




