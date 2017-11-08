package com.sysmurff.java.games.cardsgame;

import java.util.UUID;

public class Card extends GameObject {

    // FIELDS
    private Integer _atk;
    private Integer _dfc;

    // CONSTRUCTOR
    public Card(int anAttack, int aDefence) {
        super(UUID.randomUUID());
        this._atk = anAttack;
        this._dfc = aDefence;
    }

    // GETTERS
    protected Integer getAttak() {
        if(this._atk != null)
        {
            return _atk;
        }
        return null;
    }

    protected Integer getDefence() {
        if(this._dfc != null)
        {
            return _dfc;
        }
        return null;
    }

    protected void printCardInfo() {
        System.out.println("\n----------"
                         + "\n-- CARD --"
                         + "\n----------"
                         + "\nID : " + super.getID()
                         + "\nATK : " + getAttak()
                         + "\nDFC : " + getDefence());
    }

    // SETTERS
    protected void setAttack(int anAttack) {
        this._atk = anAttack;
    }

    protected void setDefence(int aDefence) {
        this._dfc = aDefence;
    }

    // INHERTED METHODS
    @Override
    protected Card draw(Deck aDeck) {
        return null;
    }
}
