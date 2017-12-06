import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {

    Card card1;

    @Before
    public void before() {
        card1 = new Card(SuitType.SPADES, CardValue.ACE);
    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitType.SPADES, card1.getSuit());
    }

    @Test
    public void canGetCardValue() {
        assertEquals(CardValue.ACE, card1.getCardValue());
    }

    @Test
    public void canGetCardEnumValue() {
        assertEquals(11, card1.getCardEnum());
    }

    @Test
    public void canGetSuitEnumValue() {
        assertEquals(2, card1.getSuitEnum());
    }
}
