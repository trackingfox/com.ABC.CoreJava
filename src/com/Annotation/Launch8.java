package com.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@interface Fruit4 { // custom annotaion- multi valued
	String delecious();

	int howMany();

	float price();
}

@Fruit4(delecious = "Very tasty", howMany = 2, price = 100)
class Grapes1 {

}

public class Launch8 {

	public static void main(String[] args) {

	}

}
