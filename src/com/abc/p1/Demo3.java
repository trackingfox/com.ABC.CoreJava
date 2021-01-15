package com.abc.p1;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Demo3 {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);

		class Demo4 implements Consumer {// using inner class

			public void accept(Object o) {
				System.out.println(o);
			}
		}

		Consumer c = new Demo();
		al.forEach(c);
	}
}