public class Card implements Comparable<Card>{

    private cardSuit suit;
    private cardValue value;
    private boolean inDeck;

    public Card(cardValue v, cardSuit s) {
        this.value = v;
        this.suit = s;
        inDeck = true;
    }

    @Override
    public int compareTo(Card c) {
        return this.value.getCardValue() - c.value.getCardValue();
    }

    public String toString() {
        return "" + value.getShorthand() + suit.getShorthand();
    }

    public boolean getInDeck() {
        return this.inDeck;
    }

    public void setInDeck(boolean b) {
        this.inDeck = b;
    }
}
