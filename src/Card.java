public class Card implements Comparable<Card>{

    private cardSuite suite;
    private cardValue value;

    public Card(cardValue v, cardSuite s) {
        this.value = v;
        this.suite = s;
    }

    @Override
    public int compareTo(Card c) {
        return this.value.getCardValue() - c.value.getCardValue();
    }

    public String toString() {
        return value.getShorthand() + suite.getShorthand();
    }
}
