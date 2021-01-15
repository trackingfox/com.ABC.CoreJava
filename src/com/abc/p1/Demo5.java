package com.abc.p1;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Demo5 {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);

		Consumer c = new Consumer() {// using anonymous class
			public void accept(Object o) {
				System.out.println(o);
			}
		};

		al.forEach(c);
	}
}