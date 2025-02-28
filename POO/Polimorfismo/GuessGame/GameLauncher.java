public class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame(new Player(), new Player(), new Player());
        game.startGame();
    }
}