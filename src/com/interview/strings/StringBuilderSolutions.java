package com.interview.strings;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class StringBuilderSolutions {
	static String str = "I lives in Mumbai";
	static LocalDate lastDayOfMonth;

	public static void main(String[] args) {
		formatDouble();
		//String day=getLastWorkingDayOfMonth();
		//System.out.println(day.toString());
		//reverseStringUsingStringBuilder(str);
		//reverseStringUsingStringBufferr(str);
	}

	public static void reverseStringUsingStringBuilder(String str) {
		StringBuilder strB = new StringBuilder(str);
		System.out.println(strB.reverse());
	}

	public static void reverseStringUsingStringBufferr(String str) {
		StringBuffer strB = new StringBuffer(str);
		System.out.println(strB.reverse());
	}

	public static String getLastWorkingDayOfMonth() {
		String lDay="";
		Date today = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);

		calendar.add(Calendar.MONTH, 1);// Used for finding next month
		calendar.set(Calendar.DAY_OF_MONTH, 1);// Setting the Day of month as 1 for starting
		do {
			calendar.add(Calendar.DATE, -1); // In the first case decease day by 1 so get the this months last day
		} while (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY); // Checking whether the last day is saturday
																			// or sunday then it will decrease by 1
		Date lastDayOfMonth = calendar.getTime();
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Today: " + sdf.format(today));
		System.out.println("Last Day of Month: " + sdf.format(lastDayOfMonth));
		
		return lastDayOfMonth.toString();
	}
	
	public static void formatDouble() {
	
	        double d = 6.3546;
	        DecimalFormat df = new DecimalFormat("#.##");
	        System.out.print(df.format(d));
	
	}
}