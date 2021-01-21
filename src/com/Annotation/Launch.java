package com.Annotation;

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class Launch {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes") // multi valued annotation
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);

	}

}
