import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> hand;
    private int handSize;

    public Hand(int handSize) {
        hand = new ArrayList<>();
        this.handSize = handSize;
    }

    @Override
    public int compareTo(Hand h) {
        return 1;
    }

    //auto sorts after drawing a single card
    public Card draw(Deck d) {
//        try {
//            hand.add(d.draw());
//        }
//        catch (Exception e) {
//            System.out.println("There are no more cards in the deck!");
//        }

        hand.add(d.draw());
        Collections.sort(hand);
        return hand.get(hand.size() - 1);
    }

    //auto sorts after filling the hand
    public void fill(Deck d) {
        while (hand.size() < handSize) {
            this.draw(d);
        }
        Collections.sort(hand);
    }

    public String toString() {
        return Arrays.toString(hand.toArray());
    }
}
