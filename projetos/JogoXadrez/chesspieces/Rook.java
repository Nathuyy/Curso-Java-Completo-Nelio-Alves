package projetos.JogoXadrez.chesspieces;

import projetos.JogoXadrez.boardGame.Board;
import projetos.JogoXadrez.chess.ChessPiece;
import projetos.JogoXadrez.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString(){
        return "R";
    }
}
