package com.ceres.Intro;

/**
 * 
 * @author Sharif Ali
 * @version 1.0
 * @since 28/09/2020
 *
 */

public class Umpire {
	
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.predictNum();
		numFromPlayer2=p2.predictNum();
		numFromPlayer3=p3.predictNum();
	}
	
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
			System.out.println("Player 1 wins");
		if(numFromGuesser==numFromPlayer2)
			System.out.println("Player 2 wins");
		if(numFromGuesser==numFromPlayer3)
			System.out.println("Player 3 wins");
		else
			System.out.println("Game lost! Try Again");
	}
}
