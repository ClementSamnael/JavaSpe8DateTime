package factory;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public abstract class Factory {
	
	static {
		new GregorianCalendar();
	}
	
	
	public static LocalDate createDate(int year, int month, int day) {
		return LocalDate.of(year, month,day);
	}
}
