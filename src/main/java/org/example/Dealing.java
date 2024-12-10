package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Dealing {
    public static void main(String[] args) {

        String[] suits ={"\u2663","\u2662","\u2661","\u2660"};
        String[] cards = new String[52];
        int index = 0;

        for(String suit:suits){
            for (int i = 0; i < 13; i++) {
                cards[index] = i + 1 + suit ;
                index++ ;
            }
        }

        for(String card:cards){
            System.out.println(card);
        }

    }
}