package com.capgemini;

import java.util.Scanner;

public class Date {
	
	public int day;
	public String month;
	public int year;
	
	Date()
	{
		//Default Constructor
		super();
	}
	
	Date(int day, String month, int year)
	{
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void printDate()
	{
		System.out.println(this.day + "/ " + this.month + "/" + this.year);
	}
	
	

	public void swapDate(Date d1, Date d2)
	{
		Date temp = d1;
		d1 = d2;
		d2 = temp;
	}
	
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	

}
