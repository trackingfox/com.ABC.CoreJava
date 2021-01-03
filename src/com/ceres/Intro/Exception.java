package com.ceres.Intro;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		
		System.out.println("entering main");
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=scan.nextInt();
		System.out.println("Enter the value of b");
		b=scan.nextInt();
		try {
		c=a/b;
		System.out.println(c);
		
		}
		catch(ArithmeticException e) {
			System.out.println("Don't divide the number by zero");
		}
		System.out.println("Exiting main");
	}

}
