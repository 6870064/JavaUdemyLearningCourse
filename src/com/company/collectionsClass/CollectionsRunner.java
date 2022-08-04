package com.company.collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsRunner {
    public static void main(String[] args) {
        List<Card> deckOfCards = new ArrayList<>();

        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                deckOfCards.add(new Card(suit, face));
            }
        }

//        System.out.println("Original deck of cards");
//        for (int i = 0; i < deckOfCards.size(); i++) {
//            System.out.printf("%-20s %s", deckOfCards.get(i), (i + 1) % 4 == 0 ? "\n" : "  ");
//        }

        Collections.shuffle(deckOfCards);
        System.out.println("\n\nCards after shuffle");

        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s %s", deckOfCards.get(i), (i + 1) % 4 == 0 ? "\n" : "  ");
        }


    }
}

