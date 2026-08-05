package chapter8;
/*
 * (The Rectangle class) Following the example of the Circle class in Section 8.2,
design a class named Rectangle to represent a rectangle. The class contains:
■ Two double data fields named width and height that specify the width and
height of the rectangle. The default values are 1 for both width and height.
■ A no-arg constructor that creates a default rectangle.
■ A constructor that creates a rectangle with the specified width and height.
■ A method named getArea() that returns the area of this rectangle.
■ A method named getPerimeter() that returns the perimeter.
Draw the UML diagram for the class and then implement the class. Write a test
program that creates two Rectangle objects—one with width 4 and height 40
and the other with width 3.5 and height 35.9. Display the width, height, area,
and perimeter of each rectangle in this order.
 */
public class Chapter8_1 {	
	public static void main(String args[]) {
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.println("The width, height, area and perimeter of rectangle 1 is: " 
				+ rectangle1.width + ", " + rectangle1.height + ", " + rectangle1.getArea() + ", and " 
				+ rectangle1.getPerimeter() + " respectively.");
		
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("The width, height, area and perimeter of rectangle 1 is: " 
				+ rectangle2.width + ", " + rectangle2.height + ", " + rectangle2.getArea() + ", and " 
				+ rectangle2.getPerimeter() + " respectively.");
	}
	
	
}
class Rectangle {
	double width = 1;
	double height = 1;
	
	Rectangle() {
	}
	
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return 2 * (width + height);
	}
	
}



