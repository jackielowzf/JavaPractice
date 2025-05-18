package Chapter5;
/*
 * Current date and time
 * Invoking System.currentTimeMillis() returns the elapsed time in milliseconds since mdinight of Jan 1, 1970
 * Write a program that displays the date and time
 */
public class Chapter5_33 {
	public static void main(String[] args) {
		
		long totalMilliseconds = System.currentTimeMillis();
		
		printDate(totalMilliseconds);
		
	}
	
	public static void printDate(long milli) {
		getCalendar(milli);
		System.out.print(" ");
		getClock(milli);
		
	}
	
	public static void getCalendar(long milli) {
		
		long totalDays = milli / (1000 * 60 * 60 * 24);
		int  currentYear = (int)(totalDays / 365.25) + 1970;
		int dayNumber = (int)(totalDays % 365.25) + 1;
		
		int adjust = isLeapYear(currentYear);
		String currentMonthAndDate = getMonthAndDate(adjust, dayNumber);
		
		System.out.print(currentYear + " " +
						 currentMonthAndDate);
	}
	
	public static int isLeapYear(int year) {
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			return 1;
		else
			return 0;
		
	}
	
	public static String getMonthAndDate(int adjust, int dayNumber) {
		
		if (dayNumber <= 31)
			return "January " + dayNumber;
		else if (dayNumber <= 59 + adjust) {
			dayNumber %= (31 + adjust);
			return "February " + dayNumber;
		}
		else if (dayNumber <= 90 + adjust) {
			dayNumber %= (59 + adjust);
			return "March " + dayNumber;
		}
		else if (dayNumber <= 120 + adjust) {
			dayNumber %= (90 + adjust);
			return "April " + dayNumber;
		}
		else if (dayNumber <= 151 + adjust) {
			dayNumber %= (120 + adjust);
			return "May " + dayNumber;
		}
		else if (dayNumber <= 181 + adjust) {
			dayNumber %= (151 + adjust);
			return "June " + dayNumber;
		}
		else if (dayNumber <= 212 + adjust) {
			dayNumber %= (181 + adjust);
			return "July " + dayNumber;
		}
		else if (dayNumber <= 243 + adjust) {
			dayNumber %= (212 + adjust);
			return "August " + dayNumber;
		}
		else if (dayNumber <= 273 + adjust) {
			dayNumber %= (243 + adjust);
			return "September " + dayNumber;
		}
		else if (dayNumber <= 304 + adjust) {
			dayNumber %= (273 + adjust);
			return "October " + dayNumber;
		}
		else if (dayNumber <= 334 + adjust) {
			dayNumber %= (304 + adjust);
			return "November " + dayNumber;
		}
		else {
			dayNumber %= (334 + adjust);
			return "December " + dayNumber;
		}
	}
	
	
	public static void getClock(long milli) {
		
		long totalSeconds = milli / 1000;
		
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		long currentMinute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currentHour = totalHours % 24;
		
		System.out.print(currentHour + ":" +
						 currentMinute + ":" +
						 currentSecond);
		
		
	}

}
