package com.Enum;

enum Demo2 {
	INDIA, USA, AUSTRALIA, UAE;

	public static void message() {
		System.out.println("Inside ENUM");
	}
}

public class Launch3 {

	public static void main(String[] args) {
		Demo2.message();

	}

}
