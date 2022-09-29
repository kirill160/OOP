package com.company.BlackJack;

import java.util.ArrayList;

public abstract class Hand {
    //? String name;
    protected ArrayList<Card> hand;
    Hand(){
        hand = new ArrayList<>();
    }
    public void takeCard(Deck deck){
        hand.add(deck.sendCard());
    }
    public int calsScore(){
        //TODO сделать чтобы туз давал 1 или 11 очков
        int score = 0;
        for (Card card: hand) {
            score += card.getRank();
        }
        return score;

    }
    public abstract void play();

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < hand.size(); i++) {
           res += hand.get(i).toString();
        }
        return res;
    }
}
