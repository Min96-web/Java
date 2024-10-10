package higherorlower;

/**
 * A playing card with suit (spades, hearts, diamond, clubs) and value (2 - 14).
 */
public class Card {
    public static String[] FACE = { "knekt", "dam", "kung", "ess" };
    public static String[] SUITS = { "spader", "hjärter", "ruter", "klöver" };
    private String _suit;
    private int _value;
    /**
     * Construct a higherorlower.Card.
     *
     * @param suit suit of the card (spades, hearts, diamond, clubs)
     * @param value value of the card (2 - 14)
     */
    public Card(String suit, int value) {
        _suit = suit;
        _value = value;
    }
    @Override
    public String toString() {
        String description = _suit + " ";
        if(_value > 10 && _value < 15) {
            description += FACE[_value - 11];
        }
        else {
            description += "" + _value;
        }
        return description;
    }
    /**
     * Checks if our card is higher than the other card.
     *
     * @param otherCard the other card
     * @return true if our card if higher than the other card
     */
    public boolean isHigherThan(Card otherCard) {
        return _value > otherCard._value;
    }
    /**
     * Checks if our card is lower than the other card.
     *
     * @param otherCard the other card
     * @return true if our card is lower than the other card
     */
    public boolean isLowerThan(Card otherCard) {
        return _value < otherCard._value;
    }
}
