package Chapter4;
/*
 * Chapter 4.44
 * Monte Carlo Simulation: 
 * A square is divided into four smaller regions as shown  below (a). If you throw a dart into the square 
 * 1,000,000 times, what is the probability for a dart to fall into an odd-numbered region? Program to simulate
 * the process and display the result. 
 * 
 * (Hint: Place the center of the square in the center of coordinate system, as shown in (b). Randomly generate
 * a point in the square and count the number of times for a point to fall into an odd-numbered region.
 */
public class Chapter4_44 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for (int i = 0; i < 1000000; i ++) {
			double x = Math.random() * 2.0 - 1;
			double y = Math.random() * 2.0 - 1;
			
			if (x < 0)
				count++;
			else if (x > 0 && y > 0 && (-1 * x + 1 < y))
				count++;
			
		}
		double probability = count / 1000000.0;
		
		System.out.println("The probability of a dart to fall into an odd-numbered region 1 and 3 is: " + (int)(probability * 10000.0) / 100.0 + "%");
	}

}
