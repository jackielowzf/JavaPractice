package Chapter6;
/*
 * Chapter 6.24
 * (Simulation: coupon collector’s problem) Coupon collector is a classic statistics
problem with many practical applications. The problem is to pick objects from a
set of objects repeatedly and find out how many picks are needed for all the
objects to be picked at least once. A variation of the problem is to pick cards from
a shuffled deck of 52 cards repeatedly and find out how many picks are needed
before you see one of each suit. Assume a picked card is placed back in the deck
before picking another. Write a program to simulate the number of picks needed to
get four cards from each suit and display the four cards picked (it is possible a card
may be picked twice). Here is a sample run of the program:
 */
public class Chapter6_24 {
	public static void main(String args[]) {
		String[][] deck = new String[52][2];
		int[][] suitCounter = new int[4][2];
		int[] rounds = new int[1];
		
		makeDeck(deck);
		couponCollector(deck, suitCounter, rounds);
		printCardsPicked(deck, suitCounter, rounds);
	}
	
	static void printCardsPicked(String[][] deck, int[][] counter, int[] rounds) {
		
		for (int a = 0; a < counter.length; a++) {
			int b = counter[a][1];
			
			for (int i = 0; i < deck[i].length; i++) {
				System.out.print(deck[b][i]);
			}
			System.out.println();
		}
		System.out.println("Number of picks: " + rounds[0]);
	}
	
	static void couponCollector(String[][] array, int[][] counter, int[] rounds) {
		
		if (counter[0][0] == 1 && counter[1][0] == 1 && counter[2][0] == 1 && counter[3][0] == 1) {
			return;
		}
		
		int num = (int)(Math.random() * 52);
		
		if (array[num][1] == "Diamonds") {
			counter[0][0]++;
			counter[0][1] = num;
			if (counter[0][0] > 1) {
				resetCounter(counter);
				counter[0][0]++;
			}
		}
		else if (array[num][1] == "Clubs") {
			counter[1][0]++;
			counter[1][1] = num;
			if (counter[1][0] > 1) {
				resetCounter(counter);
				counter[1][0]++;
			}
		}
		else if (array[num][1] == "Hearts") {
			counter[2][0]++;
			counter[2][1] = num;
			if (counter[2][0] > 1) {
				resetCounter(counter);
				counter[2][0]++;
			}
		}
		else {
			counter[3][0]++;
			counter[3][1] = num;
			if (counter[3][0] > 1) {
				resetCounter(counter);
				counter[3][0]++;
			}
		}
		
		rounds[0]++;
		couponCollector(array, counter, rounds);
	}
	
	static void resetCounter(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			array[i][0] = 0;
		}
	}
	
	static void makeDeck(String[][] array) {
		for (int i = 0, j = 0; i < 4; i++) {
			for (int counter = 0; counter < 13; counter++, j++) {
				
				if (i == 0) {
					array[j][1] = "Diamonds";
				}
				else if (i == 1) {
					array[j][1] = "Clubs";
				}
				else if (i == 2) {
					array[j][1] = "Hearts";
				}
				else
					array[j][1] = "Spades";
				
				switch (counter) {
				case 0:
					array[j][0] = "Ace of ";
					break;
				case 1:
					array[j][0] = "2 of ";
					break;
				case 2:
					array[j][0] = "3 of ";
					break;
				case 3:
					array[j][0] = "4 of ";
					break;
				case 4:
					array[j][0] = "5 of ";
					break;
				case 5:
					array[j][0] = "6 of ";
					break;
				case 6:
					array[j][0] = "7 of ";
					break;
				case 7:
					array[j][0] = "8 of ";
					break;
				case 8:
					array[j][0] = "9 of ";
					break;
				case 9:
					array[j][0] = "10 of ";
					break;
				case 10:
					array[j][0] = "Jack of ";
					break;
				case 11:
					array[j][0] = "Queen of ";
					break;
				case 12:
					array[j][0] = "King of ";
					break;
				}
			}	
		}
	}

}

