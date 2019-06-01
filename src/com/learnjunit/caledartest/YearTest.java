package com.learnjunit.caledartest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.learnjunit.nextdate.Year;

public class YearTest {
	@Test
	public void testNextYear() {
		Year y = new Year(1994);
		y.nextYear();
		assertEquals(1995, y.getYear());
	}
}
