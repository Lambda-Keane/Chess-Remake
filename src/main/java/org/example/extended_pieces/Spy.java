package org.example.extended_pieces;

import org.example.ChessPiece;
import org.example.Coordinate;

public class Spy implements ChessPiece {
    @Override
    public boolean isWhite() {
        return false;
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public Coordinate getCoordinate() {
        return null;
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public boolean isValidMove(Coordinate point) {
        return false;
    }

    @Override
    public boolean move(Coordinate point) {
        return false;
    }

    @Override
    public boolean attack(Coordinate point) {
        return false;
    }
}
