import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {

    Deck deck1;
    Deck deck2;
    Card card1;

    @Before
    public void before() {
        card1 = new Card(SuitType.SPADES, CardValue.ACE);
        deck1 = new Deck();
        deck2 = new Deck();
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

    @Test
    public void deckIsFull() {
        assertEquals(52, deck1.deckSize());
    }

    @Test
    public void checkDeck() {
        deck1.populateDeck();
        assertEquals(52, deck1.deckSize());
    }

    @Test
    public void canShuffle() {
        deck1.populateDeck();
        deck2.populateDeck();
        deck2.shuffle();
        assertNotEquals(deck1.viewDeck(), deck2.viewDeck());
    }
}
