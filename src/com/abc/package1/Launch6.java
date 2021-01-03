package com.abc.package1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Launch6 {

	public static void main(String[] args) {
		
		Student3 s1=new Student3("Rahane","Mumbai",906784563,100,100,100,100.0f);
		Student3 s2=new Student3("Gill","Chandigarh",906784565,100,100,100,100.0f);
		
		HashMap hm=new HashMap();
		hm.put(3, s1);
		hm.put(77, s2);
		System.out.println(hm);
		
		//getting the keys
		Set s=hm.keySet();
		Iterator itr=s.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//getting the values
		Collection c=hm.values();
		Iterator itr1=c.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());		}
		
		
		

	}

}
