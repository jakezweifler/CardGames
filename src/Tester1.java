public class Tester1 {

    public static void main(String[] args) {
        Card c1 = new Card(cardValue.Queen, cardSuite.Hearts);
        Card c2 = new Card(cardValue.Ace, cardSuite.Hearts);

        System.out.println(c1.compareTo(c2));

    }
}
