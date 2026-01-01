package Chapter3;

/*
 * Chapter 3.24
 * Game: Pick a card. Write a program that simulates picking a card from a deck of 52 cards. 
 * Programs will display the rank (Ace, 2, 3, .... , Jack, Queen, King) and 
 * suit (Clubs, Diamonds, Hearts, Spades) of the card 
 */
import java.util.Random;

public class Chap3_24 {
	public static void main(String[] args) {
		Random rand = new Random();
			
		//Generate 2 random number. One for rank, another for suit
		int rank = rand.nextInt(14);
		int suit = rand.nextInt(4);
		
		
		//Check the random number and print the random card pulled
		System.out.print("The card you picked is ");
		switch (rank) {
			case 0: System.out.print("Ace"); 	break;
			case 1: System.out.print("2");   	break;
			case 2: System.out.print("3");	 	break;
			case 3: System.out.print("4");	 	break;
			case 4: System.out.print("5"); 	 	break;
			case 5: System.out.print("6"); 	 	break;
			case 6: System.out.print("7");	 	break;
			case 7: System.out.print("8");	 	break;
			case 8: System.out.print("9");	 	break;
			case 9: System.out.print("10"); 	break;
			case 10: System.out.print("Jack");	break;
			case 11: System.out.print("Queen");	break;
			case 12: System.out.print("King");	break;
	
		}
		
		System.out.print(" of ");
		
		switch (suit) {
		case 0: System.out.print("Diamonds");	break;
		case 1: System.out.print("Clubs");		break;
		case 2: System.out.print("Hearts");		break;
		case 3: System.out.print("Spades");		break;
		
		}
	}

}
