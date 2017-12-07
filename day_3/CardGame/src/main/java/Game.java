import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;
    private ArrayList<Player> winners;
    private UI ui;

    public Game(Deck deck) {
        this.deck = deck;
        this.players = new ArrayList<>();
        this.winners = new ArrayList<>();
        this.ui = new UI();
    }

    public int playerCount() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public boolean checkDraw() {
        boolean result = false;
                if (players.get(0).playerhandValue() == players.get(1).playerhandValue()) {
                    result = true;
                }
        return result;
    }


    public Player playGame() {
        for (Player player : this.players ) {
            if(winners.size() == 0){
                winners.add(player);
            }
            else if(winners.get(0).playerhandValue() < player.playerhandValue()) {
                winners.clear();
                winners.add(player);
            }
            else if(player.playerhandValue() == winners.get(0).playerhandValue()){
                winners.add(player);
            }
        }
        ui.showPlayerHands(players);
      if (winners.size() == 1) {
          ui.showWinner(winners.get(0));
      }
      else {
          ui.drawMessage();
      }
        return winners.get(0);
    }
}