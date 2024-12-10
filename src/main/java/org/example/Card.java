package org.example;

public class Card {
    private  String number;
    private  String suit ;

    public Card() {
    }

    public Card(String number, String suit) {
        this.number = number;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return
                "number='" + number + '\'' +
                ", suit='" + suit + '\'';
    }
}
