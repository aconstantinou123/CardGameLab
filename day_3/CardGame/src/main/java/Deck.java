import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;
    private SuitType[] suitTypes;
    private CardValue[] cardValues;


    public Deck() {

        this.cards = new ArrayList<Card>();
        this.suitTypes = SuitType.values();
        this.cardValues = CardValue.values();
    }



    public void populateDeck() {
        for(int suit = 0; suit < 4; suit++) {
            for (int card = 0; card < 13; card++) {
                cards.add(new Card(suitTypes[suit], cardValues[card]));
            }
        }
    }


    public void shuffle() {
        this.populateDeck();
        Collections.shuffle(cards);
    }


    public String deal(Hand hand) {
        Card topCard = cards.remove(0);
        hand.addCard(topCard);
        return topCard.prettyView();
    }



}

