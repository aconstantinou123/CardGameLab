import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;
    private UI ui;

    public Game(Deck deck) {
        this.deck = deck;
        this.players = new ArrayList<>();
        this.ui = new UI();
    }

    public int playerCount() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public Player playGame() {
        Player winningPlayer = players.get(0);
        for (Player player : this.players ) {
            if(player.playerhandValue() > winningPlayer.playerhandValue()) {
                winningPlayer = player;
            }
        }
        ui.showPlayerHands(players);
        ui.showWinner(winningPlayer);
        return winningPlayer;
    }
}