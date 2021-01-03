package com.abc.package1;

import java.util.ArrayList;
import java.util.Collections;

public class Launch {

	public static void main(String[] args) {
		Student s1= new Student("Messi",99,99,99,99.0f);
		Student s2= new Student("Ronaldo",98,98,98,98.0f);
		Student s3= new Student("Neymar",95,97,98,97.0f);

		ArrayList<Student> al = new ArrayList<Student>(); //if generic <student> is not given classcast exception
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);

//		ArrayList al=new ArrayList();
//		al.add("TRAINING");//if the objects are to be sorted with respect to the 
//							//class of the object the class should implement comparable interface.
//		al.add("ABC");
//		al.add("TECH");
//		
//		Collections.sort(al);
//		System.out.println(al);

	}

}
