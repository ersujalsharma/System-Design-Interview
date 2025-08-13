package Low_Level_Design.MachineCodingRound.Design_Tic_Tac_Toe;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Game {

    Board board;
    Queue<Player> players;
    Scanner scanner;
    void initilizeGame(int boardsize){
        board = new Board(boardsize);
        scanner = new Scanner(System.in);
        players = new ArrayDeque<>();
        players = new ArrayDeque<>();
        players.add(new Player("Sujal", PieceType.X));
        players.add(new Player("Player2", PieceType.O));
    }
    void startGame(){
        Player winner = null;
        while(winner == null){
            // give player chance to place his piece type.
            Player currentPlayer = players.poll();
            printBoard();
            System.out.println(currentPlayer.playerName +" Your Turn Now ---- ");
            System.out.println("Enter row and col :");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            board.getPieces()[row][col].piecyType = currentPlayer.pieceType;
            if(checkWinningPossibilities(row,col)){
                winner = currentPlayer;
            }
            players.add(currentPlayer);
        }
        System.out.println(winner.playerName + " is the winner of the game!");
    }
    private void printBoard() {
        // TODO Auto-generated method stub
        int size = board.getPieces().length;
        System.out.println("Current Board:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Pieces piece = board.getPieces()[i][j];
                String value = piece.piecyType == null ? "_" : piece.piecyType.toString();
                System.out.print(value + " ");
            }
            System.out.print("  // row " + i);
            System.out.println();
        }
        System.out.print("Indices: ");
        for (int j = 0; j < size; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    private boolean checkWinningPossibilities(int row, int col) {
        // TODO Auto-generated method stub
        int length = board.getPieces().length;
        // check in same row;
        PieceType currentPiece= board.getPieces()[row][col].piecyType;
        boolean val1 = true;
        for(int i=0;i<length;i++){
            if(board.getPieces()[row][i].piecyType != currentPiece){
                val1 = false;
                break;
            }
        }
        boolean val2 = true;
        for(int i=0;i<length;i++){
            if(board.getPieces()[i][col].piecyType!=currentPiece){
                val2 = false;
                break;
            }
        }
        boolean val3 = true;
        if (row == col) {
            for (int i = 0; i < length; i++) {
                if (board.getPieces()[i][i].piecyType != currentPiece) {
                    val3 = false;
                    break;
                }
            }
        } else {
            val3 = false;
        }

        boolean val4 = true;
        if (row + col == length - 1) {
            for (int i = 0; i < length; i++) {
                if (board.getPieces()[i][length - 1 - i].piecyType != currentPiece) {
                    val4 = false;
                    break;
                }
            }
        } else {
            val4 = false;
        }

        return val1 || val2 || val3 || val4;
    }
}