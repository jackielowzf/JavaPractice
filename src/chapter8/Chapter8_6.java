package chapter8;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*
 * Chapter 8.6
 * (Display calendars) Rewrite the PrintCalendar class in Listing 5.12 to display
calendars in a message dialog box. Since the output is generated from several sta-
tic methods in the class, you may define a static String variable output for stor-
ing the output and display it in a message dialog box
 */
public class Chapter8_6 {
	static String output = "";
	public static void main(String args[]) {
		
		String yearString = JOptionPane.showInputDialog(null, "Enter full year (i.e, 2001): ", "Enter Year", JOptionPane.QUESTION_MESSAGE);
		int year = Integer.parseInt(yearString);
		
		String monthString = JOptionPane.showInputDialog(null, "Enter month in numbers between 1 and 12: ", "Enter Month", JOptionPane.QUESTION_MESSAGE);
		int month = Integer.parseInt(monthString);
		
		printMonth(year,month);
		JTextArea textArea = new JTextArea(output);
		textArea.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 14));
		textArea.setEditable(false);
		
		JOptionPane.showMessageDialog(null, textArea);
	}
	
	static void printMonth(int year, int month) {
		int startDay = getStartDay(year, month);
		
		int numOfDaysInMonth = getNumOfDaysInMonth(year, month);
		
		printMonthTitle(year, month);
		
		printMonthBody(startDay, numOfDaysInMonth);
	}
	
	static int getStartDay(int year, int month) {
		int startDay1800 = 3;
		long totalNumOfDays = getTotalNumOfDays(year, month);
		
		return (int)((totalNumOfDays + startDay1800) % 7);
	}
	
	static long getTotalNumOfDays(int year, int month) {
		long total = 0;
		
		for (int i = 1800; i < year; i++) {
			if (isLeapYear(i))
				total = total + 366;
			else 
				total = total + 365;
		}
		
		for (int i = 1; i < month; i++) {
			total = total + getNumOfDaysInMonth(year, i);
		}
		
		return total;
	}
	
	static int getNumOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 ||
			month ==8 || month == 10 || month == 12)
			return 31;
		
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		
		if (month == 2) {
			if (isLeapYear(year))
				return 29;
			else
				return 28;
		}
		
		return 0; //if month is incorrect
	}
	
	static boolean isLeapYear(int year) {
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			return true;
		
		return false;
	}
	
	static void printMonthBody(int startDay, int numOfDaysInMonth) {
		//Pad space before the first day of the month
		int i = 0;
		for (i = 0; i < startDay; i++) {
			output += String.format("%4s", "");
		}
		
		for (i = 1; i <= numOfDaysInMonth; i++) {
			
			output += String.format("%4d", i);
			
			if ((i + startDay) % 7 == 0)
				output += "\n";
		}
		
		output += "\n";
	}
	
	static void printMonthTitle(int year, int month) {
		output += "         " + getMonthName(month) + ", " + year + "\n";
		output += "----------------------------\n";
		output += String.format("%4s%4s%4s%4s%4s%4s%4s%n",
		        "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
	}
	
	static String getMonthName(int month) {
		String monthName = null;
		 switch (month) {
	      case 1: monthName = "January"; break;
	      case 2: monthName = "February"; break;
	      case 3: monthName = "March"; break;
	      case 4: monthName = "April"; break;
	      case 5: monthName = "May"; break;
	      case 6: monthName = "June"; break;
	      case 7: monthName = "July"; break;
	      case 8: monthName = "August"; break;
	      case 9: monthName = "September"; break;
	      case 10: monthName = "October"; break;
	      case 11: monthName = "November"; break;
	      case 12: monthName = "December";
	    }
		 
		return monthName;
	}

}

