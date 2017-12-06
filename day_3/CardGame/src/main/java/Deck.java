import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {

    private Card[] cards;
    private SuitType[] suitTypes;
    private CardValue[] cardValues;


    public Deck() {

        this.cards = new Card[52];
        this.suitTypes = SuitType.values();
        this.cardValues = CardValue.values();
    }



    public void populateDeck() {
        int index = 0;
        for(int suit = 0; suit < 4; suit++) {
            for (int card = 0; card < 13; card++) {
                cards[index] = new Card(suitTypes[suit], cardValues[card]);
                index++;
                System.out.println(cards);
            }
        }
        System.out.println("");
    }

    public int deckSize() {
        return cards.length;
    }

    public Card[] viewDeck() {
        return cards;
    }

    public void shuffle() {
        this.populateDeck();
        Collections.shuffle(Arrays.asList(cards));
    }

}

//    int index = 0;
//    for (int suit = 0; suit <= 3; suit++) {
//            for (int rank = 1; rank <= 13; rank++) {
//            deck[index] = new Card (suit, rank);
//            index++;
//            }
//            }