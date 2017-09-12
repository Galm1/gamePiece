package com.company;

public class Main {

    public static void main(String[] args) {

        gamePiece pond = new gamePiece();

        pond.setName("pond");
        pond.setColor("white");
        pond.move(10, 5);
        System.out.println(pond);

    }
}
