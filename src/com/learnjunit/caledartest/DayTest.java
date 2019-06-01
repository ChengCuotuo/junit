package com.learnjunit.caledartest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.learnjunit.nextdate.Day;

public class DayTest {

	@Test(expected=Exception.class)
	public void testNextDay() throws Exception {
		Day d = new Day(31, 20);
		d.nextDay();
		assertEquals(21, d.getDay());
	}

}
