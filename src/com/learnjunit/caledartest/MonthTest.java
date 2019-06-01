package com.learnjunit.caledartest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.learnjunit.nextdate.Month;

public class MonthTest {

	@Test(expected=Exception.class)
	public void testNextMonth() throws Exception {
		Month m = new Month(5);
		m.nextMonth();
		assertEquals(6, m.getMonth());
		m = new Month(12);
		m.nextMonth();
		assertEquals(1, m.getMonth());
	}

}
