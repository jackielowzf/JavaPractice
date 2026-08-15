package Chapter7;
/*
 * Chapter 8.8
 * The Fan class) Design a class named Fan to represent a fan. The class contains:
■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
denote the fan speed.
■ A private int data field named speed that specifies the speed of the fan (the
default is SLOW).
■ A private boolean data field named on that specifies whether the fan is on (the
default is false).
■ A private double data field named radius that specifies the radius of the fan
(the default is 5).
■ A string data field named color that specifies the color of the fan (the default
is blue).
■ The accessor and mutator methods for all four data fields.
■ A no-arg constructor that creates a default fan.
■ A method named toString() that returns a string description for the fan. If
the fan is on, the method returns the fan speed, color, and radius in one com-
bined string. If the fan is not on, the method returns the fan color and radius
along with the string “fan is off” in one combined string.
Draw the UML diagram for the class and then implement the class. Write a test
program that creates two Fan objects. Assign maximum speed, radius 10, color
yellow, and turn it on to the first object. Assign medium speed, radius 5, color
blue, and turn it off to the second object. Display the objects by invoking their
toString method.
 */
public class Chapter8_8 {
	public static void main(String args[]) {
		final int SLOW = 1, MEDIUM = 2, FAST = 3;
		
		Fan fan1 = new Fan(FAST, true, 10, "yellow");
		System.out.println(fan1.toString());
		
		Fan fan2 = new Fan(MEDIUM, false, 5, "blue");
		System.out.println(fan2.toString());
	}

}

class Fan{
	public final int SLOW = 1, MEDIUM = 2, FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5.0;
	private String color = "blue";
	
	Fan(){
	}
	
	Fan(int speed, boolean on, double radius, String color){
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}
	
	int getSpeed() {
		return speed;
	}
	
	void setSpeed(int newSpeed) {
		speed = newSpeed;
	}
	
	boolean getOnState() {
		return on;
	}
	
	void turnOn() {
		on = true;
	}
	
	void turnOff() {
		on = false;
	}
	
	double getRadius() {
		return radius;
	}
	
	void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	String getColor() {
		return color;
	}
	
	void setColor(String newColor) {
		color = newColor;
	}
	
	
	public String toString(){
		if (on)
			return "Speed is: " + speed + ", radius is: " +
							   radius + ", color is: " + color;
		else
			return "Color is: " + color + ", radius is: " +
							   radius + ", fan is off";
	}
	
}
