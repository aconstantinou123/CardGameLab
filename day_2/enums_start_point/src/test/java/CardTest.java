import static org.junit.Assert.*;
        import org.junit.*;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.SPADES, CardValues.ACE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.SPADES, card.getSuit());
    }

    @Test
    public void canGetValue(){
        assertEquals(CardValues.ACE, card.getValues());
    }

    @Test
    public void aceHasValueTen() {
       assertEquals(11, card.getValueFromEnum());
    }

    @Test
    public void canGetAllSuits() {
        SuitType[] expected = {SuitType.HEARTS, SuitType.CLUBS, SuitType.SPADES, SuitType.DIAMONDS};
        SuitType[] suits = SuitType.values();
        assertEquals(4, suits.length);
        assertArrayEquals(expected, suits);
    }



//    @Test
//    public void suitCanBeMispelled() {
//        card = new Card("Heearts");
//        assertEquals("Heearts", card.getSuit());
//    }
//
//    @Test
//    public void suitCanBeBananas() {
//        card = new Card("Bananas");
//        assertEquals("Bananas", card.getSuit());
//    }
}