package Low_Level_Design.MachineCodingRound.Design_Tic_Tac_Toe;

public class Board {
    private Pieces[][] pieces;
    public Board(int size){
        pieces = new Pieces[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                pieces[i][j] = new Pieces();
            }
        }
    }
    public Pieces[][] getPieces() {
        return pieces;
    }
    public void setPieces(Pieces[][] pieces) {
        this.pieces = pieces;
    }
}
