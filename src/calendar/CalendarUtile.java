package calendar;

import java.util.Calendar;

public class CalendarUtile {
	
	public static int year;
	public static int month;
	public static int day;
	
	Calendar cal = Calendar.getInstance();
	
	//파라미터로 받오온것을 캘린더 객체로 변환 
	public int getYear(int year) {
		
		this.year = year;
		
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		
		this.month = month;
		
		return month;
	}
	public static void main(String[] args) {

		CalendarUtile c = new CalendarUtile();
		year =11;
		c.setYear(year);
		int y = c.getYear(year);
		System.out.println(y);
	
		
	}

}
