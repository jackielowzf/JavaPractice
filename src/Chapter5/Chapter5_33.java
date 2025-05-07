package Chapter5;
/*
 * Current date and time
 * Invoking System.currentTimeMillis() returns the elapsed time in milliseconds since mdinight of Jan 1, 1970
 * Write a program that displays the date and time
 */
public class Chapter5_33 {
	public static void main(String[] args) {
		
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		long currentMinute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currentHour = totalHours % 24;
		
		long totalDays = totalHours / 24;
		
		long currentDay = totalDays % 365;
		
		long totalMonths = totalDays / 365;
		
		long currentMonth = totalMonths % 12;
		
		long currentYear = (totalDays / 365) + 1970;
		
		System.out.println(currentYear + " " + currentMonth + 
						   " " + currentDay +
						   " " + currentHour +
						   " " + currentMinute +
						   " " + currentSecond);
		
	}

}
