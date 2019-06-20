package util;

import java.time.LocalDate;
import java.util.List;

public class Util {

	
	public static void mockList(List<LocalDate> date) {
		date.add(LocalDate.of(2009,4,22));
		date.add(LocalDate.of(2008,5,02));
		date.add(LocalDate.of(2006,6,11));

	}
	
	
}
