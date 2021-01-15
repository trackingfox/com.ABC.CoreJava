package com.abc.p1;

import java.util.ArrayList;

public class Demo7 {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);

//		Consumer c = o -> System.out.println(o);
//
//		al.forEach(c);

		al.forEach(o -> System.out.println(o));
	}
}