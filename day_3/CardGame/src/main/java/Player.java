import java.util.ArrayList;

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

    public ArrayList<String> seeCard() {
        ArrayList<String> prettyCards = new ArrayList<>();
        for( Card card : this.hand.hand()){
            prettyCards.add(card.prettyView());
        }
        return prettyCards;
    }
}
