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
            }
        }
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


    public String deal(Hand hand) {

        if (this.cards[0] != null)
        {
            Card topCard = this.cards[0];
            this.cards[0] = null;
            hand.addCard(topCard);
            return topCard.prettyView();
        }
        else {
            Card topCard = this.cards[1];
            this.cards[1] = null;
            hand.addCard(topCard);
            return topCard.prettyView();
            }
        }



}

