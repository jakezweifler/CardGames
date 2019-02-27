public class Tester1 {

    public static void main(String[] args) {
        Card c1 = new Card(cardValue.Queen, cardSuit.Hearts);
        Card c2 = new Card(cardValue.Ace, cardSuit.Hearts);

        System.out.println(c1.compareTo(c2));

        Deck d = new Deck();
        System.out.println(d);

    }
}
