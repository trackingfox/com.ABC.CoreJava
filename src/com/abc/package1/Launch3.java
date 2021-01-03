package com.abc.package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Launch3 {

	public static void main(String[] args) {
		Student2 s1 = new Student2("Messi", 99, 99, 99, 99.0f);
		Student2 s2 = new Student2("Ronaldo", 98, 98, 98, 98.0f);
		Student2 s3 = new Student2("Neymar", 95, 97, 98, 97.0f);

		ArrayList<Student2> al = new ArrayList<Student2>(); // if generic <student> is not given classcast exception
		al.add(s1);
		al.add(s2);
		al.add(s3);

		System.out.println(al);
		 
		//creating object of an anonymous class which is implementing comparator interface
		Collections.sort(al, new Comparator() {

			public int compare(Object x, Object y) {
				if (((Student2) (x)).avg > ((Student2) (y)).avg) {
					return 1;
				} else
					return -1;
			}
		});
		System.out.println(al);
	}
}
	
