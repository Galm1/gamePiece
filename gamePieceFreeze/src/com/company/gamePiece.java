package com.company;

import java.util.Random;

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

        this.name = name;
        this.color = color;
    }

//    public boolean isFrozen() {
//        return frozen;
//    }
//
//    public int getPositionX(){
//        return positionX;
//    }
//
//    public int getPositionY(){
//        return positionY;
//    }

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

    public String position(){

        String position = "(" + positionX + ", " + positionY + ")";
        return position;

    }


    public void move(int newPositionX, int newPositionY){

        if(frozen == false) {
            positionX = newPositionX;
            positionY = newPositionY;
        }
    }

    public void ranMove(){

        Random r = new Random();
        if(frozen == false) {
            int newPositionX = r.nextInt(100);
            int newPositionY = r.nextInt(100);
            positionX = newPositionX;
            positionY = newPositionY;
        }
    }

    public void freeze(){

        this.frozen = true;

    }

    public void unFreeze(){


        this.frozen = false;
    }

}
