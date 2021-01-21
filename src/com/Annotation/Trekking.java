package com.Annotation;

public class Trekking {
	public void savandurga() {
		System.out.println("It is difficult Trek");
	}
}

class EasyTrekking extends Trekking {

	@Override
	public void savandurga() {
		System.out.println("It is easy Trek");
	}
}

class Launch1 {

	public static void main(String[] args) {

		EasyTrekking et = new EasyTrekking();
		et.savandurga();

	}

}
