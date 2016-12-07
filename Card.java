package blackjackGroup;


public class Card {

	private static char[] suits = {'S', 'H', 'D', 'C'};
	private static char[] ranks = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'X', 'J', 'Q', 'K', 'A'};
	private static int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
	
	private int rank;
	private int suit;
	private int pointVal;
	
	public Card() {
		this.rank = 0;
		this.suit = 0;
		this.pointVal = 1;
	}
	
	public Card(int newRank, int newSuit) {
		this.rank = newRank;
		this.suit = newSuit;
		this.pointVal = pointValues[newRank%14];
	}
	
	public char getRank() {
		return ranks[rank];
	}
	
	public char getSuit() {
		return suits[suit];
	}
	
	public int getValue() {
		return pointVal;
	}
	
	public String toString() {
		return this.getRank() +  " of " + this.getSuit() + " (" + this.getValue() + ")";
	}
}
