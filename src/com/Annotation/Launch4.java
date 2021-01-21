package com.Annotation;

//@interface Fruit { // custom annotaion -marker annotation
//
//}
@interface Fruit { // custom annotaion- single valued
	// String delecious();
	int value();
}

//@Fruit
//@Fruit(delecious="tasty fruit")
@Fruit(76)
public class Launch4 {

	public static void main(String[] args) {

	}

}
