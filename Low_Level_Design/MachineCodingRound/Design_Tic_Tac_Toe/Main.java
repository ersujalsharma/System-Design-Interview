package Low_Level_Design.MachineCodingRound.Design_Tic_Tac_Toe;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.initilizeGame(3);
        game.startGame();
        // The game will continue until a player wins or the board is full.
        // The winner will be announced at the end of the game.
    }
}
