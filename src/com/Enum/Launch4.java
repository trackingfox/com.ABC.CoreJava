package com.Enum;

enum Vegetables {
	RADISH, CARROT;

	public static void demo1() { // static function inside enum
		System.out.println("Inside");
	}

	public void demo2() {// non static function
		System.out.println("Inside");
	}

	// accessing variables from enum

	int tasty;
	String taste = "very tasty";

}

public class Launch4 {

	public static void main(String[] args) {

		Vegetables.demo1();
		Vegetables.CARROT.demo2();
		Vegetables.RADISH.demo2();
		System.out.println(Vegetables.RADISH.taste);
		System.out.println(Vegetables.CARROT.tasty);

	}

}
