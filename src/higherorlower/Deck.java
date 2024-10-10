package higherorlower;

import higherorlower.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * A deck with 52 cards.
 */
public class Deck {
    private List<Card> _cards = new ArrayList<>();
    /**
     * Create a deck with 52 card.
     */
    public Deck() {
        for(int i = 0; i < Card.SUITS.length; i ++) {
            for(int j = 2; j < 15; j ++) {
                _cards.add(new Card(Card.SUITS[i], j));
            }
        }
    }
    /**
     * Get total amount of cards in deck.
     *
     * @return total amount of cards
     */
    public int numberOfCards() {

        return _cards.size();
    }
    /**
     * Shuffle the deck.
     */
    public void shuffle() {
        Collections.shuffle(_cards);
    }
    /**
     * Get next card.
     *
     * @return next card
     */
    public Card getNextCard() {
        if(_cards.isEmpty()) {
            return null;
        }
        else {
            return _cards.remove(0);
        }
    }
}