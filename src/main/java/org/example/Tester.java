package org.example;

public class Tester {

    public static void main(String[] args) {

        Deck deck = new Deck();

        deck.shuffle();
//        deck.print();

        Card draw = deck.draw();

        System.out.println(draw);
    }
}
