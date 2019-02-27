import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {

   List<Card> deck;

   public Deck() {
       deck = new ArrayList<>();
       cardValue[] values = cardValue.values();
       cardSuit[] suits = cardSuit.values();

       for(cardSuit s : suits) {
           for(cardValue v : values) {
               deck.add(new Card(v , s));
           }
       }
   }

   public String toString() {
       return Arrays.toString(deck.toArray());
   }



}
