package Chapter7;
import java.util.Scanner;
/*
 * Chapter 7.20
 * (Game: Connect four) Connect four is a two-player board game in which the players alternately drop 
 * colored disks into a seven-column, six-row vertically suspended grid, as shown below.
 * 
 * The objective of the game is to connect four same-colored disks in a row, a column, or diagonal before
 * your opponent can do likewise. The program prompts two players to drop a red or yellow disk alternately.
 * In the preceding figure, the red disk is shown in a dark color and the yellow in a light color. 
 * Whenever a disk is dropped, the program redisplays the board on the console and determines the status of 
 * the game (win, draw, or continue).
 */
public class Chapter7_20 {
	static int[][] board;
	
	public static void main(String[] args) {
		board = new int[6][7];
		final int player1Red = 1;
		
		printBoard(board);
		playerTurn(board, player1Red);
		
	}
	
	public static void playerTurn(int[][] board, int player) {
		Scanner input = new Scanner(System.in);
		int column = 0;
		boolean nextRound = true;
		int round;
		
		for (round = 0; round < 42 && nextRound; round++) {
			//Asks player to drop disk and prints board right after
			System.out.println("Player " + player + "'s turn. Choose column 0 - 6: ");
			column = input.nextInt();
			
			while (column < 0 || column >= 7) {
				System.out.println("Invalid column. Choose 0 - 6: ");
				column = input.nextInt();
			}
			
			dropDisk(board, player, column, input);
			printBoard(board);
			
			//Check if player1 wins after dropping a disk
			if (checkBoard(board, player)) {
				System.out.println("Player " + player + " wins!");
				nextRound = false;
			}
			else {
				//Switches player at the end of round
				if (player == 1) {
					player = 2;
				}
				else {
					player = 1;
				}				
			}
		}
		
		if (round == 42 && nextRound) {
			System.out.println("Draw!");
		}
		
		input.close();
	}
	
	public static void dropDisk(int[][] board, int disk, int column, Scanner input) {
		
		while (true) {
			
			for (int i = 5; i >= 0; i--) {
				if (board[i][column] == 0) {
					board[i][column] = disk;
					return;
				}
			}
			
			System.out.println("Column is full. Choose another column: ");
			column = input.nextInt();
				
			while (column < 0 || column >= 7) {
				System.out.println("Invalid column. Choose 0 - 6: ");
				column = input.nextInt();
			}
		}
	}
	
	public static boolean checkBoard(int[][] board, int disk) {
		int rows = board.length;
		int columns = board[0].length;
			
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				
				//Check horizontal
				if (j + 3 < columns &&
					board[i][j] == disk &&
					board[i][j + 1] == disk &&
					board[i][j + 2] == disk &&
					board[i][j + 3] == disk) {
					return true;
				}
				
				//Check vertical
				if (i + 3 < rows &&
					board[i][j] == disk &&
					board[i + 1][j] == disk &&
					board[i + 2][j] == disk &&
					board[i + 3][j] == disk) {
					return true;
				}
				
				//Check left Diagonal
				if (i + 3 < rows && j + 3 < columns &&
					board[i][j] == disk &&
					board[i + 1][j + 1] == disk &&
					board[i + 2][j + 2] == disk &&
					board[i + 3][j + 3] == disk) {
					return true;
				}
				
				//Check right Diagonal
				if (i + 3 < rows && j - 3 >= 0 &&
					board[i][j] == disk &&
					board[i + 1][j - 1] == disk &&
					board[i + 2][j - 2] == disk &&
					board[i + 3][j - 3] == disk) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void printBoard(int[][] board) {
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

}
