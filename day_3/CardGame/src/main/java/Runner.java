import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

public class Runner {

    private Game game;

    public Runner(Game game){
        this.game = game;
    }

    public static void main(String[] args) {

        Deck deck = new Deck();
        Game game = new Game(deck);
        Runner runner = new Runner(game);
        runner.startGame();
    }

    public void startGame() {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Welcome to High Card");
        System.out.println("Please type how many players you require?");
        String input = scanner.nextLine();
        Integer result = Integer.parseInt(input);
        int nameNumber = 1;
        for (int i = 0; i < result; i++) {
            System.out.println("Please tell me Player " + nameNumber +"'s name:");
            String name = scanner.nextLine();
            nameNumber +=1;
            Hand hand = new Hand();
            game.addPlayer(new Player(name, hand));
             }
                game.getDeck().shuffle();
                for (Player players : game.getPlayer()) {
                game.getDeck().deal(players.getplayerhand());
                game.getDeck().deal(players.getplayerhand());

            }
             game.playGame();
        }


}

