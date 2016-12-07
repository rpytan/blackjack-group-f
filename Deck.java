package blackjackGroup;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	private List<Card> cards;
	private List<Card> discard;
	
	public Deck() {
		instantiateDeck();
	}
	
	private void instantiateDeck() {
		this.cards = new ArrayList<Card>();
		Card curCard = new Card();
		cards.add(curCard);
		
		for (int i = 0; i < 52; i++) {
			curCard = curCard.nextCard();
			cards.add(curCard);
		}
	}
	
	/**
	 * Moves the top card of the deck into the discard pile.
	 */
	public void discardCard() {
		this.discard.add(this.cards.get(0));
		this.cards.remove(0);
	}
	
}
