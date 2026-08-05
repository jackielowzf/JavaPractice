package chapter8;
/*
 * Chapter 8.2
 * (TheStock class) Following the example of the Circle class in Section 8.2,
design a class named Stock that contains:
■ A string data field named symbol for the stock’s symbol.
■ A string data field named name for the stock’s name.
■ A double data field named previousClosingPrice that stores the stock
price for the previous day.
■ A double data field named currentPrice that stores the stock price for the
current time.
■ A constructor that creates a stock with the specified symbol and name.
■ A method named getChangePercent() that returns the percentage changed
from previousClosingPrice to currentPrice.
Draw the UML diagram for the class and then implement the class. Write a test
program that creates a Stock object with the stock symbol ORCL, the name
Oracle Corporation, and the previous closing price of 34.5. Set a new current
price to 34.35 and display the price-change percentage
 */
public class Chapter8_2 {
	public static void main(String args[]) {
		Stock stock1 = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
		System.out.println(stock1.symbol + ", " + stock1.name 
						   + "'s price-change percentage: " + stock1.getChangePercent() + "%");
	}

}

class Stock {
	String symbol;
	String name;
	double previousClosingPrice = 0;
	double currentPrice = 0;
	
	Stock(){
	}
	
	Stock(String newSymbol, String newName, double newPreviousClosingPrice, double newCurrentPrice){
		symbol = newSymbol;
		name = newName;
		previousClosingPrice = newPreviousClosingPrice;
		currentPrice = newCurrentPrice;
	}
	
	double getChangePercent(){
		return (int)(((currentPrice - previousClosingPrice) / previousClosingPrice) * 10000) / 100.0;
	}
}

