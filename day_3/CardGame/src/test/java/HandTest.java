import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HandTest {

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
    public void handIsEmpty() {
        assertEquals(0, hand1.cardsInHand());
    }

    @Test
    public void handHasCard() {
        hand1.addCard(card1);
        assertEquals(1, hand1.cardsInHand());
    }
//
    @Test
    public void canSeeHandValue() {
        deck1.populateDeck();
        deck1.deal(hand1);
        assertEquals(11, hand1.handValue());
    }

}