package com.someName.projektarbete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    Player player;              // <-- NULL
    Dealer dealer;              // <-- NULL
    List<Card> deckOfCards;     // <-- NULL
    List<Player> listOfPlayers = new ArrayList<>();

    // Constructor
    public Menu(Participant player, Dealer dealer , List<Card> deckOfCards) {
        this.player = player;           // <-- player is no longer NULL
        this.dealer = dealer;
        this.deckOfCards = deckOfCards; // <-- deckOfCards is no longer NULL

        listOfPlayers.add(dealer);
        listOfPlayers.add(player);
    }



    public void mainMenu() {

        boolean isPlaying = true;

        do {
            System.out.println("""
                    1 - Start game \s
                    2 - What is your name \s
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

        // TODO - Initial 'bet'

        // TODO - Shuffle
        Collections.shuffle(deckOfCards);

        // TODO - Receive 2 cards initially
        for (int i = listOfPlayers.size() - 1; i > 0; i--) {
            listOfPlayers.get(i).draw(deckOfCards);
            listOfPlayers.get(i).draw(deckOfCards);

            for (int j = 0; j < 2; j++) {
                System.out.println(j);
            }

            System.out.println(listOfPlayers.get(i).hand);
        }


        // TODO - 'bet' money
        // TODO - DO WHILE LOOP
        // TODO - LOGIC     if > 21

        switch (scanner.next()) {
            case "1" -> {

                player.draw(deckOfCards);
                System.out.println(player.hand);

                // TODO - Draw card
                // TODO - Check AFTER receiving card if sum > 21
                // TODO - IF 21
                // TODO - BONUS (VG) check ACE value

            }
            case "2" -> System.out.println("Stay");
            // TODO - Dealer draws card
            // TODO - Check if won / lose


        }


    }

}
