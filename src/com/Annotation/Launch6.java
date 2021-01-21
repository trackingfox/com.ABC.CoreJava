package com.Annotation;

@interface Fruit2 { // custom annotaion- multi valued
	String delecious() default "ABC";

	int howMany() default 78;

	float price() default 90.0f;
}

@Fruit2()
public class Launch6 {

	public static void main(String[] args) {

	}

}
