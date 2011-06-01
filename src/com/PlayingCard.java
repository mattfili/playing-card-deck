/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.single;

/**
 *
 * @author saratchandra k
 */
public class PlayingCard {

    public enum Suit { HEARTS, DIAMONDS, SPADES, CLUBS }
    public enum Value { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING }

    Suit suit;
    Value value;

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public PlayingCard(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }
}
