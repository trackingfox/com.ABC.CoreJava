package com.abc.package1;

import java.util.Comparator;

public class Alpha implements Comparator {

	 public int compare(Object x,Object y) {
		if(((Student2)(x)).avg > ((Student2)(y)).avg) {
			return 1;
		}
		else
			return -1;
	}
}
