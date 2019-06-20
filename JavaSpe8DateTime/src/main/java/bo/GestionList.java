package bo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class GestionList {

	private static List<LocalDate> date;
	private static List<LocalTime> time;
	private static List<LocalDateTime> dateTime;	
	
	public GestionList() {
		date = new ArrayList<LocalDate>();
		time = new ArrayList<LocalTime>();
		dateTime = new ArrayList<LocalDateTime>();
	}
	
	public static List<LocalDate> getDate() {
		return date;
	}
	public static void setDate(List<LocalDate> date) {
		GestionList.date = date;
	}
	public static List<LocalTime> getTime() {
		return time;
	}
	public static void setTime(List<LocalTime> time) {
		GestionList.time = time;
	}
	public static List<LocalDateTime> getDateTime() {
		return dateTime;
	}
	public static void setDateTime(List<LocalDateTime> dateTime) {
		GestionList.dateTime = dateTime;
	}

	
}
