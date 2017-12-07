import org.junit.Before;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    Deck deck1;
    Deck deck2;
    Card card1;
    Card card2;
    Card card3;
    Hand hand1;
    Hand hand2;
    Player player1;
    Player player2;
    Game game1;
    UI ui;

    @Before
    public void before() {
        card1 = new Card(SuitType.SPADES, CardValue.ACE);
        card2 = new Card(SuitType.SPADES, CardValue.ACE);
        card3 = new Card(SuitType.CLUBS, CardValue.TWO);
        deck1 = new Deck();
        deck2 = new Deck();
        hand1 = new Hand();
        hand2 = new Hand();
        player1 = new Player("Player1", hand1);
        player2 = new Player("Player2", hand2);
        game1 = new Game(deck1);
        game1.addPlayer(player1);
        game1.addPlayer(player2);
        ui = new UI();


    }

    @Test
    public void canAddPlayer() {
        assertEquals(2, game1.playerCount());
    }


    @Test
    public void canDraw__False() {
        hand1.addCard(card1);
        hand2.addCard(card3);
        assertEquals(false, game1.checkDraw());
    }
    

    @Test
    public void playCanWin_Player1(){
        deck1.shuffle();
        deck1.deal(hand1);
        deck1.deal(hand2);
        deck1.deal(hand1);
        deck1.deal(hand2);
        game1.playGame();
    }


}
