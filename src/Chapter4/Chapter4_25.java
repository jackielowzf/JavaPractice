package Chapter4;
/*
 * Compute PI
 * Approximate PI using the following series provided in the textbook.
 * Write a program that displays the PI value for i = 10000, 20000, ..., and 100000
 */
public class Chapter4_25 {
	public static void main(String[] args) {
		
		double PI = 0;
		int count = 100000;
		
		for (int i = 1; i <= count; i++) {
			
			PI += Math.pow(-1.0, i + 1.0) / (2.0 * i - 1.0);
			
			if (i % 10000 == 0)
				System.out.println(i + "\t" + 4 * PI);
		}
		
		
	}
	
	

}
