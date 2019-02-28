public class Card implements Comparable<Card> {

    private cardSuit suit;
    private cardValue value;

    public Card(cardValue v, cardSuit s) {
        this.value = v;
        this.suit = s;
    }

    @Override
    public int compareTo(Card c) {
        return this.value.getCardValue() - c.value.getCardValue();
    }

    public String toString() {

        return "" + value.getShorthand() + suit.getShorthand();
    }

}
