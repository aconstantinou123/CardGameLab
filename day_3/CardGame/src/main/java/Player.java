import java.util.ArrayList;
import java.util.Arrays;

public class Player {

    private String name;
    private Hand hand;

    public Player(String name, Hand hand) {
        this.name = name;
        this.hand = hand;
    }

    public int playerhandValue() {
        return hand.handValue();
    }

    public String getName() {
        return name;
    }

    public String seeCard() {
        ArrayList<String> prettyCards = new ArrayList<>();
        for( Card card : this.hand.hand()){
            prettyCards.add(card.prettyView());
        }
        String result = String.join(",", prettyCards);
        return result;
    }
}
