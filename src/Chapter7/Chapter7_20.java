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
	static int counter;
	
	public static void main(String[] args) {
		board = new int[6][7];
		final int player1Red = 1;
		counter = 0;
		
		printBoard(board);
		playerTurn(board, player1Red, counter);
		
	}
	
	public static void playerTurn(int[][] board, int player, int counter) {
		Scanner input = new Scanner(System.in);
		int column = 0;
		
		if (player == 1) {
			//Player 1's turn, asks player to drop disk and prints board right after
			System.out.println("Player 1's turn: ");
			column = input.nextInt();
			dropDisk(board, 1, column);
			printBoard(board);
			
			//Check if player1 wins after dropping a disk
			if (checkBoard(board, 1) && counter < 42) {
				System.out.println("Player 1 wins!");
			}
			//Switch turns with other player
			else {
				player = 2;
				playerTurn(board, player, counter + 1);
			}
		}
		else {
			//Player 2's turn, asks player to drop disk and prints board right after
			System.out.println("Player 2's turn: ");
			column = input.nextInt();
			dropDisk(board, 2, column);
			printBoard(board);
			
			//Check if Player 2 wins after dropping disk
			if (checkBoard(board, 2)) {
				System.out.println("Player 2 wins!");
			}
			else {
				player = 1;
				playerTurn(board, player, counter + 1);
			}
		}	
		
		input.close();
	}
	
	public static void dropDisk(int[][] board, int disk, int column) {
		boolean placeDisk = true;
		
		for (int i = 5; i >= 0 && placeDisk; i--) {
			if (board[i][column] == 0) {
				board[i][column] = disk;
				placeDisk = false;
			}
		}
	}
	
	public static boolean checkBoard(int[][] board, int disk) {
		int counter = 0;
		
		//Check horizontal
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				
				if (board[i][j] == disk) {
					counter++;
					if (counter == 4) {//4 matching disks found
						return true;
					}
				}
				else 
					counter = 0;
			}
		}
		
		//Check vertical
		for (int i = 0; i < board[i].length; i++) {
			for (int j = 0; j < board.length; j++) {
				
				if (board[i][j] == disk) {
					counter++;
					if (counter == 4) {
						return true;
					}
				}
				else
					counter = 0;
			}
		}
		
		//Check left diagonal
		for (int i = 0; i < board.length; i++) {
			for (int j = 0, k = i; j < board[i].length; j++, k++) {
				
				if (board[k][j] == disk) {
					counter++;
					if (counter == 4) {
						return true;
					}
				}
				else 
					counter = 0;
			}
		}
		
		//Check right diagonal
		for (int i = 0; i < board.length; i++) {
			for (int j = 0, k = i; j < board[i].length; j--, k++) {
				
				if (board[k][j] == disk) {
					counter++;
					if (counter == 4) {
						return true;
					}
				}
				else
					counter = 0;
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
