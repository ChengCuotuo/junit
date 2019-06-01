package com.learnjunit.nextdate;

public class Date {
	public Year year;
	public Month month;
	public Day day;
	
	public Date(Year y, Month m, Day d) {
		this.year = y;
		this.month = m;
		this.day = d;
	}
	
	/**
	 *在当前时间的基础上获取下一天的日期 
	 * */
	public void nextDate() {
		int d = this.day.getDay();
		int mds = this.month.getMonthDays();
		
		if (d < mds) {
			this.day.nextDay();
		}
		
		if (d == mds) {
			this.day.nextDay();
			if (this.month.getMonth() < 12) {
				this.month.nextMonth();
			} else {
				this.month.nextMonth();
				this.year.nextYear();
			}
		}
	}
	
	@Override
	public String toString() {
		return this.year + "-" + this.month + "-" + this.day;
	}
}
