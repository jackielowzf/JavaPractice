package Chapter6;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Game: Eight Queens
 * The classic Eight Queens puzzle is to place eight queens on a chessboard such that 
 * no two queens can attack each other (i.e., no two queens are on the same row, same column,
 * or same diagonal). There are many possible solutions. Write a program that displays one such 
 * solution. A sample output is shown below: (according to textbook)
 */
public class Chapter6_22 {
	public static void main(String args[]) {
		
		final int NUMBER_OF_DAYS = 10;
		final int NUMBER_OF_HOURS = 24;
		double [][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];
		
		Scanner input = new Scanner(System.in);
		// Read input using input redirection from a file
		for (int k = 0; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++) {
			int day = input.nextInt();
			int hour = input.nextInt();
			double temperature = input.nextDouble();
			double humidity = input.nextDouble();
			data[day - 1][hour - 1][0] = temperature;
			data[day - 1][hour - 1][1] = humidity;
		}
		
		// Find the average daily temperature and humidity
		for (int i = 0; i < NUMBER_OF_DAYS; i++) {
			double dailyTemperatureTotal = 0, dailyHumidityTotal = 0;
			for (int j = 0; j < NUMBER_OF_HOURS; j++) {
				dailyTemperatureTotal += data[i][j][0];
				dailyHumidityTotal += data[i][j][1];
			}
			
			//Display result
			System.out.println("Day " + i + "'s average temperature is "
					+ dailyTemperatureTotal / NUMBER_OF_HOURS);
			System.out.println("Day " + i + "'s average humidity is " 
					+ dailyHumidityTotal / NUMBER_OF_HOURS);
		}

}
	
	
}
