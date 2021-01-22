package com.Enum;

// accessing the constants using values method
enum Vegetables4 {
	LADIESFINGER, BEETROOT, POTATO, CUCUMBER;
}

public class Launch9 {

	public static void main(String[] args) {

		Vegetables4 b = Vegetables4.BEETROOT;

		switch (b) {
		case LADIESFINGER:
			System.out.println("It is 10");
			break;
		case BEETROOT:
			System.out.println("It is 20");
			break;
		case POTATO:
			System.out.println("It is good source for carbs");

		}
	}

}
