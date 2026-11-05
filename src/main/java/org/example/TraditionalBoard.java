package org.example;

public class TraditionalBoard implements ChessBoard {
    ChessPiece[][] board;

    @Override
    public void initialize() {
        board = new ChessPiece[8][8];
    }

    @Override
    public void clear() {

    }

    @Override
    public void displayBoard() {

    }
}
