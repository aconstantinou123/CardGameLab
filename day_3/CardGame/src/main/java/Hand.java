import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cardsHeld;

    public Hand() {
        this.cardsHeld = new ArrayList<>();
    }

    public int cardsInHand() {
        return cardsHeld.size();
    }

    public void addCard(Card card) {
        this.cardsHeld.add(card);
    }

    public ArrayList<Card> hand() {
        ArrayList<Card> cardsHeldCopy = new ArrayList<>(this.cardsHeld);
        return cardsHeldCopy;
    }

    public int handValue() {
        int result = 0;
        for (Card card : cardsHeld) {
             result += card.getCardEnum();
        }
        return result;
    }

}