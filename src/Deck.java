import java.util.Arrays;

public class Deck {

   Card[] deck;

   public Deck() {
       deck = new Card[52];
       cardValue[] values = cardValue.values();
       cardSuit[] suits = cardSuit.values();

       int x = 0;
       for(cardSuit s : suits) {
           for(cardValue v : values) {
               deck[x] = new Card(v , s);
               x++;
           }
       }
   }

   public String toString() {
       return Arrays.toString(deck);
   }


}
