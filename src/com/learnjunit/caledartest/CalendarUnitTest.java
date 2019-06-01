package com.learnjunit.caledartest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.learnjunit.nextdate.Date;
import com.learnjunit.nextdate.Day;
import com.learnjunit.nextdate.Month;
import com.learnjunit.nextdate.Year;

public class CalendarUnitTest {

	@Test
	public void testNextDate() throws Exception {
		Year year = new Year(1999);
		Month month = new Month(6);
		Day day = new Day(month.getMonthDays(), 15);
		Date date = new Date(year, month, day);
		date.nextDate();
		assertEquals("1999-6-16", date.toString());
		
		year = new Year(1999);
		month = new Month(6);
		day = new Day(month.getMonthDays(), 31);
		date = new Date(year, month, day);
		date.nextDate();
		assertEquals("1999-7-1", date.toString());
	}
}
