package com.learnjunit.nextdate;

public class Year {
	private int year;
	public Year(int year) {
		this.year = year;
	}

	public void nextYear() {
		this.year = this.year + 1;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public boolean isLeapYear() {
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return this.year + "";
	}
}
