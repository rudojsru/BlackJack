import java.util.ArrayList;
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
}
