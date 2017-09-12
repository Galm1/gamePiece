package com.company;

public class gamePiece {

    int positionY;
    int positionX;
    boolean frozen;
    String name;
    String color;

    public gamePiece() {
        this.positionY = 0;
        this.positionX = 0;
        this.frozen = false;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor(String color) {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String position(int positionX, int positionY){

        String position = "("+positionX+", "+positionY+")";
        return position;

    }


    public int move(){

        positionY newPositionY = new positionY();
        positionX newPositionX = new positionX();


    }

    public boolean freeze(){

        frozen freezePiece = new frozen(false);
    }

    public boolean unFreeze(){

        frozen unfreezePiece = new frozen(true);
    }

}
