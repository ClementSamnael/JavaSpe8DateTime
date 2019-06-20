package bo;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionList {

	private int year, month, day;
	private ArrayList<LocalDate> listDate;

	public static LocalDate createDate(int year, int month, int day) {
		return LocalDate.of(year, month, day);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public ArrayList<LocalDate> getListDate() {
		return listDate;
	}

	public void setListDate(ArrayList<LocalDate> listDate) {
		this.listDate = listDate;
	}
}
