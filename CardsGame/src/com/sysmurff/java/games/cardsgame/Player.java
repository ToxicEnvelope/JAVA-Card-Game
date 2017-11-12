package com.sysmurff.java.games.cardsgame;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class Player implements ICrowdControll {


    // FIELDS
    private UUID _id;
    private String _name;    
    // Add the ability of having more then 1 Card object in hand 
    private List<Card> _cardsInHand = new ArrayList<Card>();		
    //private Card _cardInHand;
    private Card _that;
    protected int SCORE = 0;


    // CONSTRUCTOR
    public Player(String aName) {
        this._id = UUID.randomUUID();
        this._name = aName;
        this._cardsInHand = null;
    }


    // GETTERS
    protected String getName() {
        return _name;
    }

    protected UUID getID() {
        return _id;
    }

    // Returns List<Card> _cardsInHand -> all Card objects that the Player have  
    protected List<Card> getAllCards() {
    	return _cardsInHand;
    }
    
    // Works the same, return _cardsInHand._FIRST_INDEX_ -> Card object
    protected Card getCardInHand() {
        this._that = _cardsInHand.get(0);
        _cardsInHand = null;
        return _that;
    }

//    protected Card getCardInHand() {
//        this._that = _cardInHand;
//        _cardInHand = null;
//        return _that;
//    }

    protected void printPlayerInfo() {
        System.out.println("\n----------"
                + "\n-- CARD --"
                + "\n----------"
                + "\nID : " + getID()
                + "\nNAME : " + getName());
    }

    protected Boolean isCardInHand() {
        if(this._cardsInHand != null)
        {
            return true;
        }
        return false;
    }

    protected void draw(Deck aDeck) {
        this._cardsInHand.add(aDeck.draw());
    }
    
    //    protected void draw(Deck aDeck) {
    //        this._cardInHand = aDeck.draw();
    //    }

    // IMPLEMENTED METHODS
	@Override
	public void spyOnMe(int aCardIndex) {
		_cardsInHand.get(aCardIndex).printCardInfo();
	}


	@Override
	public void spyOnYou(Player p, int index) {
		p.getAllCards().get(index).printCardInfo();
	}


	@Override
	public Card switchCard() {
		
		return null;
	}


	@Override
	public Card switchCardSmart() {
		// TODO Auto-generated method stub
		return null;
	}


}
