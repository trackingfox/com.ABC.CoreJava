package com.abc.package1;

public class Student3 {

	String name;
	String address;
	int phno;
	int marks1;
	int marks2;
	int marks3;
	float avg;
	public Student3(String name, String address, int phno, int marks1, int marks2, int marks3, float avg) {
		super();
		this.name = name;
		this.address = address;
		this.phno = phno;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.avg = avg;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getPhno() {
		return phno;
	}
	public int getMarks1() {
		return marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public float getAvg() {
		return avg;
	}
	@Override
	public String toString() {
		return "Student3 [name=" + name + ", address=" + address + ", phno=" + phno + ", marks1=" + marks1 + ", marks2="
				+ marks2 + ", marks3=" + marks3 + ", avg=" + avg + "]";
	}
	 

	
	
}


