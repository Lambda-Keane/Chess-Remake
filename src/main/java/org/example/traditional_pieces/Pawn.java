package org.example.traditional_pieces;

import org.example.ChessPiece;
import org.example.Coordinate;

public class Pawn implements ChessPiece {
    int x, y;
    Coordinate coordinate;

    public Pawn(int x, int y) {
        this.x = x;
        this.y = y;
        this.coordinate = new Coordinate(x,y);
    }

    public Pawn(Coordinate coordinate) {
        this.x = coordinate.x();
        this.y = coordinate.y();
        this.coordinate = coordinate;
    }

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
        return coordinate;
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public boolean isValidMove(Coordinate coordinate) {
        return false;
    }

    @Override
    public boolean move(Coordinate coordinate) {
        return false;
    }

    @Override
    public boolean attack(Coordinate coordinate) {
        return false;
    }
}
