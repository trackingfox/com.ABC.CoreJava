package com.Enum;

// accessing the constants using values method
enum Vegetables2 {
	LADIESFINGER, BEETROOT, POTATO, CUCUMBER;
}

public class Launch6 {

	public static void main(String[] args) {

		Vegetables[] v = Vegetables.values();

		for (Vegetables v1 : v) {
			System.out.println(v1);
		}

	}

}
