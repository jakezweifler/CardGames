public class Tester1 {

    public static void main(String[] args) {
        Card c1 = new Card(cardValue.Queen, cardSuit.Hearts);
        Card c2 = new Card(cardValue.Ace, cardSuit.Hearts);

        System.out.println(c1.compareTo(c2));

        Deck d = new Deck();
        System.out.println(d);

        Hand h1 = new Hand(5);
        h1.draw(d);
        h1.fill(d);
        System.out.println(h1);

        Hand h2 = new Hand(48);
        h2.fill(d);
        System.out.println(h2);
    }
}
