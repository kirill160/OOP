package com.company.BlackJack;

public class Card {
    private char suit;
    private String rank;

    public Card() {

    }

    public Card(char suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public int getRank() {
        int res = 0;
        switch (rank) {
            case "A":
                res = 1;
                break;
            case "2":
                res = 2;
                break;
            case "3":
                res = 3;
                break;
            case "4":
                res = 4;
                break;
            case "5":
                res = 5;
                break;
            case "6":
                res = 6;
                break;
            case "7":
                res = 7;
                break;
            case "8":
                res = 8;
                break;
            case "9":
                res = 9;
            case "10":
            case "J":
            case "Q":
            case "K":
                res = 10;
                break;

        }
        return res;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " " + suit;
    }
}
