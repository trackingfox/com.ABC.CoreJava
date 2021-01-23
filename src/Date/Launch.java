package Date;

import java.time.LocalDate;
import java.time.LocalTime;

public class Launch {

	public static void main(String[] args) {

		LocalDate d = LocalDate.now();

		System.out.println(d.getYear());
		System.out.println(d);
		System.out.println(d.getMonth());
		System.out.println(d.getMonthValue());
		System.out.println(d.getDayOfMonth());
		System.out.println(d.getDayOfWeek());

		LocalTime t = LocalTime.now();
		System.out.println(t);
		t.getHour();
		t.getMinute();
		t.getSecond();
		t.getNano();

	}

}
