package com.someName.projektarbete;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Deck deckTemplate = new Deck();
        Player player = new Player();

        List<Card> deckOfCards = deckTemplate.generateDeck();   // Sorted by default
        Menu menu = new Menu(player, deckOfCards);

        menu.mainMenu(); // Starts Blackjack


    }
}
