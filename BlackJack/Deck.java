package com.company.BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private final int suitSize = 13;
    private final int deckSize = 52;
    private ArrayList<Card> cardsDeck;
    public Deck(){
        cardsDeck = new ArrayList<>();
        init();
        shuffle();
        sendCard();
    }
    private void init() {
        initSuit('\u2661');
        initSuit('\u2662');
        initSuit('\u2664');
        initSuit('\u2667');
//        for (int i = 1; i <= 13; i++) {
//            if (i < 10) {
//                cardsDeck.add(new Card('\u2662', i));
//            } else {
//                cardsDeck.add(new Card('\u2662', 10));
//            }
//        }
//        for (int i = 1; i <= 13; i++) {
//            if (i < 10) {
//                cardsDeck.add(new Card('\u2664', i));
//            } else {
//                cardsDeck.add(new Card('\u2664', 10));
//            }
//        }
//        for (int i = 1; i <= 13; i++) {
//            if (i < 10) {
//                cardsDeck.add(new Card('\u2666', i));
//            } else {
//                cardsDeck.add(new Card('\u2666', 10));
//            }
//        }
//        for (int i = 1; i <= 13; i++) {
//            if (i < 10) {
//                cardsDeck.add(new Card('\u2667', i));
//            } else {
//                cardsDeck.add(new Card('\u2667', 10));
//            }
//        }
    }
    private void initSuit(char suit ) {
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (int i = 0; i < suitSize; i++) {
                cardsDeck.add(new Card(suit, ranks[i]));

            }
        }


    private void shuffle(){
        Random random = new Random();

        for (int i = 0; i < cardsDeck.size() - 1; i++) {
            int randomIndex = random.nextInt(deckSize - i - 1) + i + 1;
            Collections.swap(cardsDeck, i, randomIndex );
        }
    }



    public Card sendCard (){
      Card t = cardsDeck.get(cardsDeck.size() - 1);
      cardsDeck.remove(cardsDeck.size() - 1);
      return t;
    }

    @Override
    public String toString() {
        return cardsDeck.toString();
    }
}
