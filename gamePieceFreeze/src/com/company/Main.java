package com.company;

public class Main {

    public static void main(String[] args) {

        gamePiece pond = new gamePiece();

        pond.setName("pond");
        pond.setColor("white");
        pond.move(10, 5);
        System.out.println(pond.position());
        pond.move(11,4);
        System.out.println(pond.position());
        pond.freeze();
        pond.move(15, 03);
        System.out.println(pond.position());
        pond.unFreeze();
        pond.move(13,7);
        System.out.println(pond.position());

    }
}
