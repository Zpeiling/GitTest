package com.tiedao.pojo;

import java.util.Date;

public class Demo {
	private Integer id;
	private String month;
	private double lastYear;
	private double todayYear;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public double getLastYear() {
		return lastYear;
	}

	public void setLastYear(double lastYear) {
		this.lastYear = lastYear;
	}

	public double getTodayYear() {
		return todayYear;
	}

	public void setTodayYear(double todayYear) {
		this.todayYear = todayYear;
	}

	@Override
	public String toString() {
		return "Demo [id=" + id + ", month=" + month + ", lastYear=" + lastYear
				+ ", todayYear=" + todayYear + "]";
	}
}
