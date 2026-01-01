package Chapter4;
/*
 * Display calenders.
 * Write a program that prompts the user to enter the year and first day of the year and displays the calendar table for the
 * year on the console. For example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013, 
 * program should display the calendar for each month in the year
 */
import java.util.Scanner;

public class Chapter4_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
				
		//Asks user for Year and first day of the year
		System.out.println("Input the year: ");
		int year = input.nextInt();
		System.out.println("Input the first day of the year (0~6 : Sunday ~ Saturday): ");
		int dayOfTheWeek = input.nextInt();
		
		input.close();
		
		int daysInMonth = 0;
		
		for (int i = 0; i < 12; i++) {
			switch (i) {
				case 0: 
					System.out.println("\tJanuary " + year);
					spacing(dayOfTheWeek);
					daysInMonth = 31;
					dayOfTheWeek = calendarPrint(dayOfTheWeek, daysInMonth);
					break;
				case 1:
					System.out.println("\n\n\tFebruary " + year);
					spacing(dayOfTheWeek);
					daysInMonth = 28;
					dayOfTheWeek = calendarPrint(dayOfTheWeek, daysInMonth);
					break;
				case 2:
					System.out.println("\n\n\tMarch " + year);
					spacing(dayOfTheWeek);
					daysInMonth = 31;
					dayOfTheWeek = calendarPrint(dayOfTheWeek, daysInMonth);
					break;
				case 3:
					System.out.println("\n\n\tApril " + year);
					spacing(dayOfTheWeek);
					daysInMonth = 30;
					dayOfTheWeek = calendarPrint(dayOfTheWeek, daysInMonth);
					break;
				case 4:
					System.out.println("\n\n\tMay " + year);
					spacing(dayOfTheWeek);
					daysInMonth = 31;
					dayOfTheWeek = calendarPrint(dayOfTheWeek, daysInMonth);
					break;
				case 5:
					System.out.println("\n\n\tJune " + year);
					spacing(dayOfTheWeek);
					daysInMonth = 30;
					dayOfTheWeek = calendarPrint(dayOfTheWeek, daysInMonth);
					break;
				case 6:
					System.out.println("\n\n\tJuly " + year);
					spacing(dayOfTheWeek);
					daysInMonth = 31;
					dayOfTheWeek = calendarPrint(dayOfTheWeek, daysInMonth);
					break;
				case 7:
					System.out.println("\n\n\tAugust " + year);
					spacing(dayOfTheWeek);
					daysInMonth = 31;
					dayOfTheWeek = calendarPrint(dayOfTheWeek, daysInMonth);
					break;
				case 8:
					System.out.println("\n\n\tSeptember " + year);
					spacing(dayOfTheWeek);
					daysInMonth = 30;
					dayOfTheWeek = calendarPrint(dayOfTheWeek, daysInMonth);
					break;
				case 9:
					System.out.println("\n\n\tOctober " + year);
					spacing(dayOfTheWeek);
					daysInMonth = 31;
					dayOfTheWeek = calendarPrint(dayOfTheWeek, daysInMonth);
					break;
				case 10:
					System.out.println("\n\n\tNovember " + year);
					spacing(dayOfTheWeek);
					daysInMonth = 30;
					dayOfTheWeek = calendarPrint(dayOfTheWeek, daysInMonth);
					break;
				case 11:
					System.out.println("\n\n\tDecember " + year);
					spacing(dayOfTheWeek);
					daysInMonth = 31;
					dayOfTheWeek = calendarPrint(dayOfTheWeek, daysInMonth);
					break;
			}
		}
	}
	
	public static int calendarPrint(int dayOfWeek, int daysInMonth) {
			
		for (int day = 1; day <= daysInMonth; day++) {
			System.out.printf("%4d", day);
			
			if (dayOfWeek == 6) {
				System.out.println();
				dayOfWeek = 0;
			}
			else			
				dayOfWeek++;
		}
		
		return dayOfWeek;
	}
	
	public static void spacing(int dayOfWeek) {
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat\n");
		
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("    ");
		}
		
	}

}
