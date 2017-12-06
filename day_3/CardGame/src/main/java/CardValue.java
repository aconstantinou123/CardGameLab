public enum CardValue {
    ACE(11, "Ace"),
    TWO(2, "Two"),
    THREE(3, "Three"),
    FOUR(4, "Four"),
    FIVE(5, "Five"),
    SIX(6, "Six"),
    SEVEN(7, "Seven"),
    EIGHT(8, "Eight"),
    NINE(9, "Nine"),
    TEN(10, "Ten"),
    JACK(10, "Jack"),
    QUEEN(10, "Queen"),
    KING(10, "King");

    private final int value;
    private final String type;

    private CardValue(int value, String type) {
        this.value = value;
        this.type = type;
    }

    public int getValue() {
        return this.value;
    }

    public String getType() {
            return this.type;
        }
}
