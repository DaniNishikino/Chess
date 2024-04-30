package chess;

import boardgame.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch(){
        board = new Board(8,8);
    }
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int i1 = 0; i1 < board.getColumns(); i1++) {
                mat[i][i1] = (ChessPiece) board.piece(i,i1);
            }
        }
        return mat;
    }
}
