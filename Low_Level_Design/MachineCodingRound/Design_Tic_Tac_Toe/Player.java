package Low_Level_Design.MachineCodingRound.Design_Tic_Tac_Toe;

public class Player {
    int id;
    String playerName;
    PieceType pieceType;
    public Player(String playerName,PieceType pieceType){
        this.playerName = playerName;
        this.pieceType = pieceType;
    }
}
