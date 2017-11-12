package com.sysmurff.java.games.cardsgame;


/*
 * This Interface has been created for the purpose of enhance the Player moves and add more functionalities 
 * that may effect the other Players in the game.
 */
public interface ICrowdControll {
	
	public void spyOnMe(int x);
	public void spyOnYou(Player p, int i);
	public Card switchCard();
	public Card switchCardSmart();
	
}
