package Chapter7;
/*
 * (Compute the weekly hours for each employee) Suppose the weekly hours for all employees are stored in a two-dimensional 
 * array. Each row records an employee's seven-day work hours with seven columns. For example, the following array stores
 * the work hours for eight employees. Write a program that displays employees and their total hours in decreasing order of 
 * the total hours. (According to textbook)
 */
public class Chapter7_4 {
	public static void main(String args[]) {
		int[][] m = {{2, 4, 3, 4, 5, 8, 8},
					 {7, 3, 4, 3, 3, 4, 4},
					 {3, 3, 4, 3, 3, 2, 2},
					 {9, 3, 4, 7, 3, 4, 1},
					 {3, 5, 4, 3, 6, 3, 8},
					 {3, 4, 4, 6, 3, 4, 4},
					 {3, 7, 4, 8, 3, 8, 4},
					 {6, 3, 5, 9, 2, 7, 9}};
		
		int[][] combinedHours = combinedHours(m);
		sortDescending(combinedHours);
		printArray(combinedHours);
	}
	
	public static int[][] combinedHours(int[][] m){
		
		int[][] total = new int[8][2];
		
		for (int i = 0; i < m.length; i++) {
			
			int totalHours = 0;
			for (int j = 0; j < m[i].length; j++) {
				totalHours += m[i][j];
			}
			
			total[i][0] = i;
			total[i][1] = totalHours;
		}
		return total;
	}
	
	public static void sortDescending(int[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			
			int maxIndex = i;
			for (int j = i + 1; j < m.length; j++) {
				if (m[j][1] > m[maxIndex][1]) {
					maxIndex = j;
				}
			}
			
			int tempIndex = m[i][0];
			int tempHours = m[i][1];
			
			m[i][0] = m[maxIndex][0];
			m[i][1] = m[maxIndex][1];
			
			m[maxIndex][0] = tempIndex;
			m[maxIndex][1] = tempHours;
		}
	}
	
	public static void printArray(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++){
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

}
