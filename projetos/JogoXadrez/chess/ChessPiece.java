package projetos.JogoXadrez.chess;

import projetos.JogoXadrez.boardGame.Board;
import projetos.JogoXadrez.boardGame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
