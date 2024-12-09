package projetos.JogoXadrez;

import projetos.JogoXadrez.boardGame.Board;
import projetos.JogoXadrez.chess.ChessMatch;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(8, 8);
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
