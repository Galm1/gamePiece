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
    public int getPositionX(){
        return positionX;
    }

    public int getPositionY(){
        return positionY;
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

        String position = "(" + positionX + ", " + positionY + ")";
        return position;

    }


    public void move(int newPositionX, int newPositionY){

        do {
            positionX = newPositionX;
            positionY = newPositionY;
        } while (frozen = false);
    }

    public void freeze(){

        this.frozen = true;

    }

    public void unFreeze(){

        this.frozen = false;
    }

}
