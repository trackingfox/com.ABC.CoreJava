package com.abc.package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Launch5 {

	public static void main(String[] args) {
		
		ArrayList al =new ArrayList();
		al.add(450);
		al.add(567);
		al.add(678);
		al.add(890);
		al.add(34);
		al.add(567);
		System.out.println(al);
		Collections.rotate(al, 1);
		System.out.println(al);
		
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
		
		System.out.println(al);
		System.out.println(Collections.frequency(al,567));
		
		Collections.replaceAll(al, 567, 999);
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);
		
		
		
//		System.out.println(Collections.binarySearch(al, 678));
//		System.out.println(al);
		
//		Comparator c=Collections.reverseOrder();
//		Collections.sort(al,c);
		//Collections.reverse(al);
		//System.out.println(al);
		
		
		
		
	}
}
	
