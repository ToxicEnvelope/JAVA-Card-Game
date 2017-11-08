package com.sysmurff.java.games.cardsgame;

import java.util.ArrayList;

public class Game {


    // FIELDS
    private Boolean _isOFF;
    protected ArrayList<Player> _listOfPlayers = new ArrayList<Player>();
	ArrayList<Card> cards = new ArrayList<Card>();
    private Deck _deck;


    // CONSTRUCTOR
    public Game() {
        init();
    }

    protected void init() {
        try {
            for ( int n=0; n<2; n++)
            {
                this._listOfPlayers.add( new Player("Player " + (n+1)));
            }
            this._deck = new Deck();
            this._isOFF = false;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void start() {
        while(!this._isOFF) {
            if(!this._deck.isEmpty())
            {
            	for (Player p : _listOfPlayers)
            	{
            		if(!p.isCardInHand())
            		{
            			p.draw(this._deck);
            			cards.add(p.getCardInHand());
            		}	
            	}
            	compareCards(cards);
            	cards.clear();
            }
            else {
            	compareScore(_listOfPlayers);
            } 
        }
    }

    protected void compareCards(ArrayList<Card> cards) {
		ArrayList<Integer> points = new ArrayList<Integer>();
    	for (Card c : cards)
    	{
    		points.add(c.getAttak());
    		points.add(c.getDefence());
    	}
    	if( (points.get(0) + points.get(1)) > (points.get(2) + points.get(3)) ) 
    	{
    		_listOfPlayers.get(0).SCORE++;
    		points.clear();
    		System.out.println(_listOfPlayers.get(0).getName() + " has won this round!");
    	}
    	else if( (points.get(0) + points.get(1)) < (points.get(2) + points.get(3)) ){
    		_listOfPlayers.get(1).SCORE++;
    		points.clear();
    		System.out.println(_listOfPlayers.get(1).getName() + " has won this round!");
    	}
    	else {
    		_listOfPlayers.get(0).SCORE++;
    		_listOfPlayers.get(1).SCORE++;
    		points.clear();
    		System.out.println("IT WAS A DRAW!!!!");
    	}
    }
    
    protected void compareScore(ArrayList<Player> players) {
    	if(players.get(0).SCORE > players.get(1).SCORE)
    	{
    		System.out.println(players.get(0).getName() + " won the game with " + players.get(0).SCORE + " score points");
    	}
    	else if(players.get(0).SCORE < players.get(1).SCORE) {
    		System.out.println(players.get(1).getName() + " won the game with " + players.get(1).SCORE + " score points");
    	}
    	else {
    		System.out.println("AMAIZING!!! It's a DRAW!");
    	}
    	
    	this._isOFF = true;
    }
}
