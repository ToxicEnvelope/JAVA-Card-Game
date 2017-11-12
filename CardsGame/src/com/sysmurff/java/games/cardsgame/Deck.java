package com.sysmurff.java.games.cardsgame;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Deck extends GameObject {

    // FIELDS
    private ArrayList<Card> _cardsInDeck = new ArrayList<Card>();
    private Card _current;


    // CONSTRUCTOR
    public Deck() {
        super(UUID.randomUUID());
        generateCards();
    }


    // GETTERS
    protected ArrayList<Card> getCardsInDeck() {
        if(!this._cardsInDeck.isEmpty())
        {
            return _cardsInDeck;
        }
        return null;
    }

    protected Card draw() {
         this._current = _cardsInDeck.get(0);
         this._cardsInDeck.remove(0);
         return _current;
    }

    protected void printDeckInfo() {
        System.out.println("\n----------"
                         + "\n-- DECK --"
                         + "\n----------"
                         + "\nID : " + super.getID()
                         + "\nTOTAL : " + this._cardsInDeck.size());
    }

    protected void printCardsInDeck() {
        printDeckInfo();
        for( int n=0; n<this._cardsInDeck.size(); n++ )
        {
            _cardsInDeck.get(n).printCardInfo();
        }
    }

    protected Boolean isEmpty() {
        if(this._cardsInDeck.isEmpty())
        {
            return true;
        }
        return false;
    }

    // PRIVATE METHODS
    private void generateCards() {
        for( int n=0; n<6; n++ )
        {
            this._cardsInDeck.add(new Card(getRandNum(), getRandNum()));
        }
    }

    private Integer getRandNum() {
        return new Random().nextInt(10) + 1;
    }

    // INHERITED METHODS
    @Override
    protected Card draw(Deck d) {
        d = this;
        return d.draw();
    }


}


