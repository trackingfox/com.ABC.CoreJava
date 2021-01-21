package com.Enum;

enum Vegetables1 {
	RADISH("tasty"), CARROT("Very tasty", 4), ONION;

	String tasty;
	int number;

	Vegetables1(String tasty, int number) {
		this.tasty = tasty;
		this.number = number;
	}

	Vegetables1(String tasty) {
		this.tasty = tasty;

	}

	Vegetables1() {

	}

	String getTasty() {
		return tasty;
	}

	int getNumber() {
		return number;
	}

}

public class Launch5 {

	public static void main(String[] args) {

		System.out.println(Vegetables1.RADISH.getTasty());
		System.out.println(Vegetables1.RADISH.getNumber());
		System.out.println(Vegetables1.CARROT.getTasty());
		System.out.println(Vegetables1.CARROT.getNumber());
		System.out.println(Vegetables1.ONION.getTasty());
		System.out.println(Vegetables1.ONION.getNumber());

	}

}
