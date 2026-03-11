package Chapter7;
/*
 * Chapter 7.3
 * (Sort students on grades) Rewrite Listing 7.2, GradeExam.java, to display the students in increasing order of the number of correct answers.
 */
public class Chapter7_3 {
	public static void main(String[] args) {
		// Students' answers to the questions
		char[][] answers = {
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
		
		int[][] m = new int[8][2];
		
		 // Key to the questions
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		
		 // Grade all answers
		for (int i = 0; i < answers.length; i++) {
			m[i][0] = i;
		 
		// Grade one student
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if ( answers[i][j] == keys[j])
				correctCount++;
		 	}
		
			m[i][1] = correctCount;
		
		 	System.out.println("Student " + i + "'s correct count is " +
		 						correctCount);
		 }
		
		ascendingSort(m);
		printArray(m);
		
	}
	
	public static void ascendingSort(int[][] m) {
				
		for (int i = 0; i < m.length - 1; i++) {
			
			int minIndex = i;
			for (int j = i + 1; j < m.length; j++) {
				if(m[j][1] < m[minIndex][1]) {
					minIndex = j;
				}	
			}
			
			int tempId = m[i][0];
			int tempScore = m[i][1];
			
			m[i][0] = m[minIndex][0];
			m[i][1] = m[minIndex][1];
			
			m[minIndex][0] = tempId;
			m[minIndex][1] = tempScore;
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
