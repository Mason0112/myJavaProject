package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
//    Card[] cards = new Card[52];
    List<Card> cards = new ArrayList<Card>();

    public Deck() {
        initCards();
    }

    private void initCards() {
        cards.clear();
        for (Numbers number:Numbers.values()) {
            for (Suits suit: Suits.values()) {
                cards.add(new Card(number.name(), suit.name()));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public  void  print(){

        for(Card card:cards){
            System.out.println(card);
        }
    }

    public Card draw(){

        Card card = cards.get(0);

        return  card;
    }



}
