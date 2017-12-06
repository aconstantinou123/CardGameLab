import java.util.ArrayList;

public class UI {
    public void showPlayerHands(ArrayList<Player> players) {
        for (Player player : players){
            System.out.println(player.getName() + ":" + player.seeCard());
        }
    }
}
