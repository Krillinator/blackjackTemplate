package com.someName.projektarbete;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Deck deckTemplate = new Deck();
        Participant player1 = new Participant();
        Dealer dealer = new Dealer();

        List<Card> deckOfCards = deckTemplate.generateDeck();   // Sorted by default

        Menu menu = new Menu(player1, dealer, deckOfCards);

        menu.mainMenu(); // Starts Blackjack


    }
}
