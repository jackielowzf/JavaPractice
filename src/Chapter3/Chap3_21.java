package Chapter3;

/*
 * Chapter 3.21 (Science:day of the week)
 * Zeller's Congruence. Given this formula, it performs an interger division.
 * Prompts user year, month and day of month. Displays the name of the day of 
 * the week. 
 */
import java.util.Scanner;

public class Chap3_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		//Asks the user for the year, month and day of the month
		System.out.println("Enter year (e.g. 2015): ");
		int year = input.nextInt();
		System.out.println("Enter month (Jan:1 ~ Dec:12): ");
		int month = input.nextInt();
		System.out.println("Enter day of the month (1~31): ");
		int dayOfMonth = input.nextInt();
		
		input.close();
		
		switch (month) {
			case 1:
				month = 13;
				year -= 1;
				break;
			case 2:
				month = 14;
				year -= 1;
				break;
		}
		
		//Call to function and display results
		int dayOfWeek = formula(year, month, dayOfMonth);
		
		switch (dayOfWeek) {
			case 0:
				System.out.println("Day of the week is Saturday");
				break;
			case 1:
				System.out.println("Day of the week is Sunday");
				break;
			case 2:
				System.out.println("Day of the week is Monday");
				break;
			case 3:
				System.out.println("Day of the week is Tuesday");
				break;
			case 4:
				System.out.println("Day of the week is Wednesday");
				break;
			case 5:
				System.out.println("Day of the week is Thursday");
				break;
			case 6:
				System.out.println("Day of the week is Friday");
				break;
		}
		
		
		
		
	}
	
	public static int formula(int year, int m, int q) {
		//declare variables j, k 
		int j = year / 100;
		int k = year % 100;
		
		//Formula given in textbook to calculate day of the week
		int h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
		
		return h;
	}

}
