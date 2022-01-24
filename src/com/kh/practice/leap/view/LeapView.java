package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.GregorianCalendar;

public class LeapView {
	public LeapView() {
		// 2019년은 평년입니다.
		// 총 날짜 수 : 73716
//		Calendar cal = Calendar.getInstance(); 
		Calendar cal = new GregorianCalendar();
		cal.set(2020, 3, 15);
//		System.out.println(cal.getTime());
		int year = cal.getWeekYear();
//		boolean isLeap = ctrl.isLeapYear(year)
//		Formatter f = new Formatter(System.out);
//		f.format("%d년은 %s입니다.\n", year, (isLeap):"윤년");
//		f.format("총 날짜 수: %d\n", ctrl.leapDate(cal));
//		f.close();
	}
}
