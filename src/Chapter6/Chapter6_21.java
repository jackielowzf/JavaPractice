package Chapter6;
import java.util.Scanner;
import java.util.Arrays;
/*
 * Chapter 6.21
 * Game: bean machine
 * The bean machine, also known as a quincunx or the Galton box, is a device for statistic experiments named after English scientist Sir Francis Galton. 
 * It consists of an upright board with evenly spaced nails (or pegs) in a triangular form, as shown in Figure 6.15.
 * 
 * Balls are dropped from the opening of the board. Every time a ball hits a nail, it has a 50% chance of falling to the left or to the right. The piles
 * of balls are accumulated in the slots at the bottom of the board. 
 * 
 * Write a program that simulates the bean machine. Your program should prompt the user to enter the number of the balls and the number of the slots in the machine. 
 * Simulate the falling of each ball by printing its path. For example, the path for the ball in Figure 6.15b is LLRRLLR and the path for the ball in Figure 6.15c
 * is RLRRLRR. Display the final buildup of the balls in the slots in a histogram. Here is a sample(textbook)
 * 
 * Hint: Create an array named slots. Each element in slots stores the number of balls in a slot. Each ball falls into a slot via a path. The number of Rs in a path is the
 * position of the slot where the ball falls. For example, for the path LRLRLRR, the ball falls into slots[4], and for the path is RRLLLLL, the ball falls into slots[2].
 */
public class Chapter6_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of ball to drop: ");
		int NumberOfBalls = input.nextInt();
		System.out.println("Enter the number of slots in the bean machine");
		int NumberOfSlots = input.nextInt();
		
		input.close();
		
		int[] slots = new int[NumberOfSlots + 1];
		
		
		beanMachine(NumberOfBalls, NumberOfSlots, slots);
		
	}
	
	public static void beanMachine(int balls, int slots, int array[]) {
		int counter = 0;
		for (int i = 0; i < balls; i++) {
			for (int j = 0; j < slots; j++) {
				int num = (int)(Math.random() * 2);
				if (num == 1) {
					counter++;
					System.out.print("R");
				}
				else {
					System.out.print("L");
				}
				
			}
			array[counter]++;
			counter = 0;
			System.out.println("");
		}
		
		System.out.println(Arrays.toString(array));
		
	}


}
