package com.Annotation;

@interface Fruit1 { // custom annotaion- multi valued
	String delecious();

	int howMany();

	float price();
}

@Fruit1(delecious = "very tasty", howMany = 2, price = 59.0f)
public class Launch5 {

	public static void main(String[] args) {

	}

}
