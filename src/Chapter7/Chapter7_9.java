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
		int[][] board = new int[3][3];
		
		//X is player1 and O is player2
		int x = 1;
		int o = 2;
		int row, column = 0;
		
		//Check for matching 3 
		for (int counter = 0; counter < 9; counter++) {
			inputPlacement(board, x);
			checkMatchThree(board, x);
		}
		
	}
	
	public static void inputPlacement(int[][] board, int pattern) {
		
		int row = 0;
		int column = 0;
		Scanner input = new Scanner(System.in);
		
		do {
		
		System.out.println("Enter a row (0, 1, or 2) for player " + pattern + ": ");
		row = input.nextInt();
		
		System.out.println("Enter a column (0, 1, or 2) for player" + pattern + ": ");
		column = input.nextInt();
		
		} while (board[row][column] != 0); 
		
		board[row][column] = pattern;
		
		input.close();
	}
	
	public static boolean checkMatchThree(int[][] board, int pattern) {
		
		
	}

}
