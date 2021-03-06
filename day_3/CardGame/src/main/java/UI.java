import java.util.ArrayList;

public class UI {
    public void showPlayerHands(ArrayList<Player> players) {
        for (Player player : players){
            System.out.println(player.getName() + " has " + player.seeCard());
        }
    }

    public void showWinner(Player winningPlayer){
        System.out.println(System.lineSeparator());
        System.out.println(winningPlayer.getName() + " is the winner with a total score of " + winningPlayer.playerhandValue()+ "!");
    }

    public void drawMessage() {
        System.out.println(System.lineSeparator());
        System.out.println("It's a draw");
    }
}
