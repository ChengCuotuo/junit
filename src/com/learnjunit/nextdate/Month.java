package com.learnjunit.nextdate;

public class Month {
	public static final int[] MONTHDAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int month;
	
	public Month(int month) throws Exception {
		if (this.month > 12) {
			throw new Exception("月份大于12");
		} else {
			this.month = month;
		}
	}
	
	public void nextMonth() {
		this.month = this.month + 1 > 12 ? 1 : this.month + 1;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getMonthDays () {
		return this.MONTHDAYS[this.month];
	}
	@Override
	public String toString() {
		return this.month + "";
	}
}
