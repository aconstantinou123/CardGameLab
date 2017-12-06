public class Card {

    private SuitType suit;
    private CardValue value;

    public Card(SuitType inputSuit, CardValue inputValue) {
        this.suit = inputSuit;
        this.value = inputValue;
    }

    public SuitType getSuit() {
        return suit;
    }

    public CardValue getCardValue() {
        return value;
    }

    public int getCardEnum() {
        return value.getValue();
    }

    public int getSuitEnum() {
        return suit.getSuitValue();
    }
}
