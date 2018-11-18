package org.martynas.model;

public class Coordinates {
    private int y;
    private int x;

    public Coordinates() {
        this.x = 0;
        this.y = 0;
    }

    public Destination increaseX (){
        this.x++;
        return Destination.EAST;
    }

    @Override
    public String toString() {
        return "(" + x + "; " + y + ")";
    }

    public Destination increaseY (){
        this.y++;
        return Destination.NORTH;
    }

    public Destination decreaseX (){
        this.x--;
        return Destination.WEST;
    }

    public Destination decreaseY (){
        this.y--;
        return Destination.SOUTH;
    }
}
