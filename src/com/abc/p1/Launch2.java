package com.abc.p1;

@FunctionalInterface
interface Display1 {
	void disp1();
}

public class Launch2 {

	public static void main(String[] args) {

		Display1 d = new Display1() {
			public void disp1() {
				System.out.println("Hello");
			}
		};

		d.disp1();
	}

}
