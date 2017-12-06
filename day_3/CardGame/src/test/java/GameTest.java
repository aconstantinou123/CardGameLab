import org.junit.Before;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    Deck deck1;
    Deck deck2;
    Card card1;
    Hand hand1;
    Hand hand2;
    Player player1;
    Player player2;
    Game game1;

    @Before
    public void before() {
        card1 = new Card(SuitType.SPADES, CardValue.ACE);
        deck1 = new Deck();
        deck2 = new Deck();
        hand1 = new Hand();
        hand2 = new Hand();
        player1 = new Player("Player1", hand1);
        player2 = new Player("Player2", hand2);
        game1 = new Game(deck1);
        game1.addPlayer(player1);
        game1.addPlayer(player2);

    }

    @Test
    public void canAddPlayer() {
        assertEquals(2, game1.playerCount());
    }

    @Test
    public void playCanWin_Player1(){
        deck1.populateDeck();
        deck1.deal(hand1);
        deck1.deal(hand2);
        assertEquals(11, player1.playerhandValue());
        assertEquals(player1, game1.playGame());
    }
}