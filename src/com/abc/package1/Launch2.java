package com.abc.package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Launch2 {

	public static void main(String[] args) {
		Student2 s1= new Student2("Messi",99,99,99,99.0f);
		Student2 s2= new Student2("Ronaldo",98,98,98,98.0f);
		Student2 s3= new Student2("Neymar",95,97,98,97.0f);

		ArrayList<Student2> al = new ArrayList<Student2>(); //if generic <student> is not given classcast exception
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println(al);
		Alpha a= new Alpha();
		Collections.sort(al,a);
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
	
