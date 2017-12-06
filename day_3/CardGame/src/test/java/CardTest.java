import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {

    Deck deck1;
    Deck deck2;
    Card card1;
    Hand hand1;
    Hand hand2;

    @Before
    public void before() {
        card1 = new Card(SuitType.SPADES, CardValue.ACE);
        deck1 = new Deck();
        deck2 = new Deck();
        hand1 = new Hand();
        hand2 = new Hand();
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
    public void canSeePrettyCardName() {
        assertEquals("The Ace of Spades", card1.prettyView());
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
        assertNotEquals(deck1.deal(hand1), deck2.deal(hand1));
    }

    @Test
    public void canDeal() {
        deck1.populateDeck();
        assertEquals("The Ace of Hearts", deck1.deal(hand1));
        assertEquals("The Two of Hearts", deck1.deal(hand2));
        assertNotNull(hand1.hand());
        assertNotNull(hand2.hand());
        assertEquals(11, hand1.handValue());
    }
}
