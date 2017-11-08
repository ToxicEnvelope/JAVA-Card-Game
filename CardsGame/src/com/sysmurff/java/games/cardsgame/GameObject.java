package com.sysmurff.java.games.cardsgame;

import java.util.UUID;

public abstract class GameObject {

    // FIELDS
    private UUID _id;

    // CONSTRUCTOR
    public GameObject(UUID anID) {
        this._id = anID;
    }

    // GETTERS
    protected UUID getID() {
        return _id;
    }

    // SETTERS
    protected void setID(UUID anID) {
        this._id = anID;
    }

    protected abstract Card draw(Deck aDeck);


}
