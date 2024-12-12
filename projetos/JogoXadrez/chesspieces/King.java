package projetos.JogoXadrez.chesspieces;

import projetos.JogoXadrez.boardGame.Board;
import projetos.JogoXadrez.chess.ChessMatch;
import projetos.JogoXadrez.chess.ChessPiece;
import projetos.JogoXadrez.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color, ChessMatch chessMatch) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        return new boolean[0][];
    }
}
