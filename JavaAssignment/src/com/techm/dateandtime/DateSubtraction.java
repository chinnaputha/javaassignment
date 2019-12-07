package com.techm.dateandtime;

import java.util.Calendar;

public class DateSubtraction {
	public void Remove (){
		Calendar cal = Calendar.getInstance();
		System.out.println("Curremt Date Is"+cal.getTime());
		cal.add(cal.DATE, -45);
		System.out.println("After removing the days in the calender is "+cal.getTime());
		
	}
	public static void main(String[] args) {
		DateSubtraction da = new DateSubtraction();
		da.Remove();
		System.out.println("hello java");
		
	}
}

