package com.abc.p1;

import java.util.ArrayList;
import java.util.function.Consumer;

class Demo implements Consumer {

	public void accept(Object o) {
		System.out.println(o);
	}
}

public class Demo1 {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);

		Consumer c = new Demo();
		al.forEach(c);
	}
}
