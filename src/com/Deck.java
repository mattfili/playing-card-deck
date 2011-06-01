/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group;

import com.single.PlayingCard;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author saratchandra k
 */
public class Deck {

    private List<PlayingCard> cards;

    /**
     * default constructor for a single deck
     */
    public Deck() {
        cards = new ArrayList<PlayingCard>();
        /*cycle through the 4 suits*/
        for (PlayingCard.Suit suit : PlayingCard.Suit.values()) {
            /*cycle through the 13 values*/
            for (PlayingCard.Value value : PlayingCard.Value.values()) {
                PlayingCard pc = new PlayingCard(suit, value);
                cards.add(pc);
            }
        }
    }

    /**
     * Constructor for multiple decks.
     * @param i = no of decks
     */
    public Deck(int i) {
        cards = new ArrayList<PlayingCard>();
        /*cycle through the # of decks*/
        for (; i > 0; i--) {
            /*cycle through the 4 suits*/
            for (PlayingCard.Suit suit : PlayingCard.Suit.values()) {
                /*cycle through the 13 values*/
                for (PlayingCard.Value value : PlayingCard.Value.values()) {
                    PlayingCard pc = new PlayingCard(suit, value);
                    cards.add(pc);
                }
            }
        }
    }

    /**
     * Returns an instance of the deck.
     * @return
     */
    public List<PlayingCard> getTheDeck() {
        return cards;
    }

    /**
     * Add code to include jokers in the deck.
     * @param noOfJokers
     */
    public void addJokers(int noOfJokers) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Add code to deal out a given number of cards from this deck
     * @param noOfCards
     * @return
     */
    public List<PlayingCard> deal(int noOfCards){
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Add code to shuffle theDeck. Use before you deal cards.
     */
    public void shuffle(){
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
