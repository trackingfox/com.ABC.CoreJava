package com.abc.p1;

import java.util.ArrayList;

public class Launch3 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);

		al.forEach(a -> System.out.println(a));

	}
}