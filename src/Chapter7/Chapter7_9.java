package Chapter7;

import java.util.Scanner;
/*
 * Chapter 7.9
 * (Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns
marking an available cell in a 3 x 3 grid with their respective tokens (either X or O).
When one player has placed three tokens in a horizontal, vertical, or diagonal row on
the grid, the game is over and that player has won. A draw (no winner) occurs when
all the cells on the grid have been filled with tokens and neither player has achieved
a win. Create a program for playing tic-tac-toe.
The program prompts two players to enter an X token and O token alternately.
Whenever a token is entered, the program redisplays the board on the console and
determines the status of the game (win, draw, or continue). Here is a sample run:
 */
public class Chapter7_9 {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int[][] board = new int[3][3];
		
		//X is player1 and O is player2
		int x = 1;
		int o = 2;
		int player = 0;
		
		//Check for matching 3 
		for (int counter = 0; counter < 9; counter++) {
			if (counter % 2 == 0) {
				player = x;
			}
			else {
				player = o;
			}
			inputPlacement(board, player, input);
			
			printBoard(board);
			
			if(checkMatchThree(board, player)) {
				input.close();
				return;
			}
			
		}
		input.close();
		
	}
	
	public static void printBoard(int[][] board) {
		
		for (int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static void inputPlacement(int[][] board, int pattern, Scanner input) {
		
		int row = 0;
		int column = 0;
		
		do {
		
		System.out.println("Enter a row (0, 1, or 2) for player " + pattern + ": ");
		row = input.nextInt();
		
		System.out.println("Enter a column (0, 1, or 2) for player" + pattern + ": ");
		column = input.nextInt();
		
		} while (board[row][column] != 0); 
		
		board[row][column] = pattern;
		
	}
	
	public static boolean checkMatchThree(int[][] board, int pattern) {
		
		//checks rows
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == pattern &&
				board[i][1] == pattern &&
				board[i][2] == pattern) {
				
				System.out.println("Player " + pattern + "wins!");
				return true;
			}
		}
		//check columns
		for (int j = 0; j < 3; j++) {
			if (board[0][j] == pattern &&
				board[1][j] == pattern &&
				board[2][j] == pattern) {
				
				System.out.println("Player " + pattern + " wins!");
				return true;
			}
		}
		
		//checks diagonals
		if (board[0][0] == pattern &&
			board[1][1] == pattern &&
			board[2][2] == pattern) {
			
			System.out.println("Player " + pattern + " wins!");
			return true;
		}
		
		if (board[0][2] == pattern &&
			board[1][1] == pattern &&
			board[2][0] == pattern) {
			
			System.out.println("Player " + pattern + " wins!");
			return true;
		}
		
		return false;
	}

}
