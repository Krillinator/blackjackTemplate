package com.someName.projektarbete;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Deck deckTemplate = new Deck();
        Random random = new Random();

        List<Card> deckOfCards = deckTemplate.generateDeck();

        System.out.println(deckOfCards);

        System.out.println(deckOfCards.get(0));
        System.out.println();
        System.out.println(deckOfCards.remove(0));

        // TODO - Being able to draw a card
        // #1 - deckOfCards - 1 Card LESS
        // #2 - Calculate Card Value
        // #3 - Do While - Scanner + Switch cases

    }
}
