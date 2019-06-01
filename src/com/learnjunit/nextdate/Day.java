package com.learnjunit.nextdate;

public class Day {
	public int monthDays;
	public int day;
	
	public Day (int monthDays, int day) throws Exception {
		if (day > monthDays){
			throw new Exception("天数大于本月最大天数");
		}else {
			this.monthDays = monthDays;
			this.day = day;
		}
	}
	
	public int getDay() {
		return this.day;
	}
	
	public void nextDay() {
		this.day += 1;
		if (this.day > this.monthDays) {
			this.day = 1;
		}
	}
	
	@Override
	public String toString() {
		return this.day + "";
	}
}
