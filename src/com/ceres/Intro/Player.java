package com.ceres.Intro;

import java.util.Scanner;

public class Player {

	
	int pnum;
	/**
	 * 
	 * @return
	 */
	int predictNum()
	{
		System.out.println("Player! Kindly predict a number between 1 to 100 : ");
		Scanner scan=new Scanner(System.in);
		pnum=scan.nextInt();
		return pnum;
	}
}
