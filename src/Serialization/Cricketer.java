package Serialization;

import java.io.Serializable;

public class Cricketer implements Serializable {

	String name;
	int runs;
	float avg;
	float strikeRate;

	public Cricketer(String name, int runs, float avg, float strikeRate) {
		super();
		this.name = name;
		this.runs = runs;
		this.avg = avg;
		this.strikeRate = strikeRate;
	}

	public void disp() {

		System.out.println(name);
		System.out.println(runs);
		System.out.println(avg);
		System.out.println(strikeRate);
	}
}
