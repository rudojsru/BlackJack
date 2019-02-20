import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> cards = new ArrayList<>();

     public Deck(){
         for (int suit = 0; suit <4 ; suit++) {
             for (int value = 0; value <13 ; value++) {

                  cards.add(new Card(Suit.values()[suit],Value.values()[value]));
             }
         }
     }
     public void shuffler(){
         Collections.shuffle(cards);
     }

     public Card handOutCard(){
      return cards.remove(0);
     }
}
