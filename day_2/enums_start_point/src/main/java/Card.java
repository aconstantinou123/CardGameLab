public class Card {

    private SuitType suit;
    private CardValues values;

    public Card(SuitType suit, CardValues values) {
        this.suit = suit;
        this.values = values;
    }

    public SuitType getSuit(){
        return this.suit;
    }

    public CardValues getValues(){
        return this.values;
    }

    public int getValueFromEnum() {
        return  this.values.getValue();
    }
}