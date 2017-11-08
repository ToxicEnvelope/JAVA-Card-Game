package com.sysmurff.java.games.cardsgame;

import java.util.UUID;


public class Player {


    // FIELDS
    private UUID _id;
    private String _name;
    private Card _cardInHand;
    private Card _that;
    protected int SCORE = 0;


    // CONSTRUCTOR
    public Player(String aName) {
        this._id = UUID.randomUUID();
        this._name = aName;
        this._cardInHand = null;
    }


    // GETTERS
    protected String getName() {
        return _name;
    }

    protected UUID getID() {
        return _id;
    }

    protected Card getCardInHand() {
        this._that = _cardInHand;
        _cardInHand = null;
        return _that;
    }

    protected void printPlayerInfo() {
        System.out.println("\n----------"
                + "\n-- CARD --"
                + "\n----------"
                + "\nID : " + getID()
                + "\nNAME : " + getName());
    }

    protected Boolean isCardInHand() {
        if(this._cardInHand != null)
        {
            return true;
        }
        return false;
    }

    protected void draw(Deck aDeck) {
        this._cardInHand = aDeck.draw();
    }


}