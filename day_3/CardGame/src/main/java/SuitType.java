import java.util.ArrayList;

public enum SuitType {
    HEARTS(0),
    DIAMONDS(1),
    SPADES(2),
    CLUBS(3);

    private final int value;

    private SuitType(int value) {
        this.value = value;
    }

    public int getSuitValue() {
        return this.value;
    }


}
