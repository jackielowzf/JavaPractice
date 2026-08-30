package Chapter6;
/*
 * Chapter 6.34
 * (Game: multiple Eight Queens solutions) Exercise 6.22 finds one solution for the
Eight Queens problem. Write a program to count all possible solutions for the
Eight Queens problem and display all solutions
 */
public class Chapter6_34 {
	static int[][] board;
	
	public static void main(String args[]) {
		int N = 8;
		board = new int[N][N];
		placeNQueens(N, 0);
		
	}
	
	static void placeNQueens(int N, int row) {
		if (row == N) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("\n_____________________\n");
			return;
		}
		for(int i = 0; i < N; i++) {
			if (isPossible(N, row, i)) {
				board[row][i] = 1;
				placeNQueens(N, row + 1); 
			}
			board[row][i] = 0;
		}
		
		return;
	}
	
	static boolean isPossible(int N, int row, int col) {
		for (int i = 0; i < row; i++) {
			if (board[i][col] == 1) {
				return false;
			}
		}
		
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}
		
		for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
			if (board[i][j] == 1) {
				return false;
			}
		}
		
		return true;
	}

}
