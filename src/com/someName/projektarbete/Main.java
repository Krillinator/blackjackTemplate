package com.someName.projektarbete;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Deck deckTemplate = new Deck();

        List<Card> deckOfCards = deckTemplate.generateDeck();

        System.out.println(deckOfCards);

    }
}
