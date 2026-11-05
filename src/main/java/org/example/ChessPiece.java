package org.example;

public interface ChessPiece {
    boolean isWhite();

    int getX();

    int getY();

    Coordinate getCoordinate();

    int getValue();

    boolean isValidMove(Coordinate point);

    boolean move(Coordinate point);

    boolean attack(Coordinate point);
}
