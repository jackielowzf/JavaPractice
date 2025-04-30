package Chapter5;
/*
 * Convert milliseconds to hours, minutes, and seconds.
 * Write a method that converts milliseconds to hours, minutes, and seconds using the following header:
 * 
 * public static String convertMIllis(long millis)
 * 
 * the method returns a string hours:minutes:seconds. For example, convertMillis(5500) returns a string 0:0:5, convertMillis(100000) returns a string 0:1:40, 
 * convertMillis(555550000) returns a string a string 154:19:10.
 */
import java.util.Scanner;

public class Chapter5_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of milliseconds");
		long millis = input.nextLong();
		
		input.close();
		
		String time = convertMillis(millis);
		
		System.out.println("The time is " + time);
		
	}
	
	public static String convertMillis(long millis) {
		
		long totalSeconds = millis / 1000;
		long seconds	  = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long minutes	  = totalMinutes % 60;
		long hours		  = totalMinutes / 60;
		
		String secondsAsString = String.valueOf(seconds);
		String minutesAsString = String.valueOf(minutes);
		String hoursAsString   = String.valueOf(hours);
		
		String time = hoursAsString + ":" + minutesAsString + ":" + secondsAsString;
		
		return time;
	}

}
