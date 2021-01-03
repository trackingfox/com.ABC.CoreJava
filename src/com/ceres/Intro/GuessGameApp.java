package com.ceres.Intro;
/**
 * 
 * @author Sharif Ali
 * @version 1.0
 * @since 28/09/2020
 *
 */

public class GuessGameApp {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Umpire U= new Umpire();
		U.collectNumFromGuesser();
		for(int i=1;i<=3;i++)
		{			
			U.collectNumFromPlayers();
			U.compare();
		}
		

	}

}
