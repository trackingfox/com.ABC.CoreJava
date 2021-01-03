package com.ceres.Intro;

public class Program1 {

	public static void main(String[] args) {
		
		Thread t=Thread.currentThread();
		t.setName("ABC");
		t.setPriority(3);
		System.out.println(t);
	}

}
