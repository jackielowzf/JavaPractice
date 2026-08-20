package Chapter6;
/*
 * Game: Eight Queens
 * The classic Eight Queens puzzle is to place eight queens on a chessboard such that 
 * no two queens can attack each other (i.e., no two queens are on the same row, same column,
 * or same diagonal). There are many possible solutions. Write a program that displays one such 
 * solution. A sample output is shown below: (according to textbook)
 */
public class Chapter6_22 {
	static int[][] board;
	
	public static void main(String args[]) {
		int N = 8;
		board = new int[N][N];
		placeNQueens(N, 0);
		
	}
	
	static boolean placeNQueens(int N, int row) {
		if (row == N) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
			return true;
		}
		for(int i = 0; i < N; i++) {
			if (isPossible(N, row, i)) {
				board[row][i] = 1;
				
				if (placeNQueens(N, row + 1)) {
					return true;
				}
			}
			board[row][i] = 0;
		}
		
		return false;
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
