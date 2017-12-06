import java.util.ArrayList;

public enum SuitType {
    HEARTS(0, "Hearts"),
    DIAMONDS(1, "Diamonds"),
    SPADES(2, "Spades"),
    CLUBS(3, "Clubs");

    private final int value;
    private final String type;

    private SuitType(int value, String type) {
        this.value = value;
        this.type = type;
    }

    public int getSuitValue() {
        return this.value;
    }

    public String getSuittype() {
        return this.type;
    }

}
