package com.Annotation;

class Salary {

	@Deprecated
	public void initialAmount() {
		System.out.println("My salary was 10k");
	}

	public void updatedAmount() {
		System.out.println("My salary is 90k");
	}
}

class Launch2 {

	public static void main(String[] args) {

		Salary s = new Salary();
		s.updatedAmount();
		s.initialAmount();

	}

}
