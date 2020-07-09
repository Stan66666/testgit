package com.neuedu.first;

public class HourlyEmployee extends ColaEmployee{
	
	int hourSalary;
	int hour;
	
	public HourlyEmployee(String name, int birthday,int hourSalary,int hour) {
		super(name, birthday);
		this.hourSalary = hourSalary;
		this.hour = hour;
	}
	
	public double getSalary(int month) {
		
		if(super.birthday == month) {
			if(hour>160) {
				return hourSalary*160 + (hour-160)*hourSalary*1.5 + 100;
			}else {
				return hourSalary*hour + 100;
			}
		}else {
			if(hour>160) {
				return hourSalary*160 + (hour-160)*hourSalary*1.5;
			}else {
				return hourSalary*hour;
			}
		}
	}
}
