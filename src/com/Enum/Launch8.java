package com.Enum;

import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention()
@Inherited
@inheritance Fruit
{
	
}

@Fruit
class Grapes
{
	
}

class BlackGrapes extends Grapes {

}

enum Veggies extends Grapes
{
	
}