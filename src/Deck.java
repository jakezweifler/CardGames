import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

   private List<Card> deck;

   public Deck() {
       deck = new ArrayList<>();
       cardValue[] values = cardValue.values();
       cardSuit[] suits = cardSuit.values();

       for(cardSuit s : suits) {
           for(cardValue v : values) {
               deck.add(new Card(v , s));
           }
       }
       Collections.shuffle(deck);
   }

   public String toString() {
       return Arrays.toString(deck.toArray());
   }

   public List<Card> getDeck() {
       return deck;
   }

   public void reshuffle() {
       Deck d = new Deck();
       deck = d.getDeck();
   }

    public Card draw() {
       return deck.remove(0);
    }
}
