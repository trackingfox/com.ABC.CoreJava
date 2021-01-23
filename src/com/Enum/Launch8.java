package com.Enum;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Inherited // it means this inherited annotation will be applied to all the child classes.
@interface Fruit {

}

@Fruit
class Grapes {

}

interface Demo10 {

}

class BlackGrapes extends Grapes {

}

//enum cannot extend any class but it can implement interfaces
enum Veggies implements Demo10 {

}