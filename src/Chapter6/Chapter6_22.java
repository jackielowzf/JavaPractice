package Chapter6;
import java.util.Scanner;

/*
 * Game: Eight Queens
 * The classic Eight Queens puzzle is to place eight queens on a chessboard such that 
 * no two queens can attack each other (i.e., no two queens are on the same row, same column,
 * or same diagonal). There are many possible solutions. Write a program that displays one such 
 * solution. A sample output is shown below: (according to textbook)
 */
public class Chapter6_22 {
	 static final int N = 8;

	    public static void main(String[] args) {
	        int[][] board = new int[N][N];

	        if (solve(board, 0)) {
	            printBoard(board);
	        } else {
	            System.out.println("No solution exists");
	        }
	    }

	    // Try to place queens starting from column col
	    static boolean solve(int[][] board, int col) {
	        if (col == N) {
	            return true; // all queens placed
	        }

	        for (int row = 0; row < N; row++) {
	            if (isSafe(board, row, col)) {
	                board[row][col] = 1;

	                if (solve(board, col + 1)) {
	                    return true;
	                }

	                // backtrack
	                board[row][col] = 0;
	            }
	        }
	        return false;
	    }

	    // Check if a queen can be placed at board[row][col]
	    static boolean isSafe(int[][] board, int row, int col) {

	        // Check left side of row
	        for (int i = 0; i < col; i++) {
	            if (board[row][i] == 1)
	                return false;
	        }

	        // Check upper-left diagonal
	        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
	            if (board[i][j] == 1)
	                return false;
	        }

	        // Check lower-left diagonal
	        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
	            if (board[i][j] == 1)
	                return false;
	        }

	        return true;
	    }

	    static void printBoard(int[][] board) {
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                System.out.print(board[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	
	
}
