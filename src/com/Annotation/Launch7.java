package com.Annotation;

@interface Fruit3 { // custom annotaion- multi valued
	String delecious();

	int howMany();

	float price();
}

@Fruit3(delecious = "Very tasty", howMany = 2, price = 100)
class Grapes {

}

public class Launch7 {

	public static void main(String[] args) {

		Grapes g = new Grapes();
		Class c = g.getClass();
		// Annotation an=c.getAnnotation(Fruit3.class);
		Fruit3 an = (Fruit3) c.getAnnotation(Fruit3.class);
		System.out.println(an);
	}

}
