package com.someName.projektarbete;

import java.util.ArrayList;
import java.util.List;

public class Player {

    List<Card> pHand = new ArrayList<>();

    public void draw(List<Card> deckOfCards) {
        pHand.add(deckOfCards.get(0));
        // pHand.add(deckOfCards.get(deckOfCards.size() -1));
        deckOfCards.remove(0);
    }


}
