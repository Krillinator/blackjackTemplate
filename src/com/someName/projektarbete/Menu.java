package com.someName.projektarbete;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    Player player;              // <-- NULL
    List<Card> deckOfCards;     // <-- NULL

    // Constructor
    public Menu(Player player, List<Card> deckOfCards) {
        this.player = player;           // <-- player is no longer NULL
        this.deckOfCards = deckOfCards; // <-- deckOfCards is no longer NULL
    }



    public void mainMenu() {

        boolean isPlaying = true;

        do {
            System.out.println("""
                    1 - Start game \s
                    2 - About this game \s
                    0 - Exit Game \s
                    """);

            switch (scanner.next()) {
                case "1" -> menuStartGame();
                case "2" -> System.out.println("What is your name");

                case "0" -> isPlaying = false;

                default -> System.out.println("Error");
            }

        } while (isPlaying);

    }




    public void menuStartGame() {

        // TODO - Shuffle
        Collections.shuffle(deckOfCards);

        // TODO - Receive 2 cards initially
        // TODO - 'bet' money

        switch (scanner.next()) {
            case "1" -> {

                player.draw(deckOfCards);

                // TODO - Draw card
                // TODO - Check AFTER receiving card if sum > 21
                // TODO - IF 21
                // TODO - BONUS (VG) check ACE value

            }
            case "2" -> System.out.println("Stay");
        }


    }

}
