package com.abc.p1;

@FunctionalInterface
interface Display {
	void disp1();
}

public class Launch {

	public static void main(String[] args) {

		Display d = new Display() {
			public void disp1() {
				System.out.println("Hello");
			}
		};

		d.disp1();
	}

}
