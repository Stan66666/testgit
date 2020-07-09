package com.neuedu.first;

public class SalesEmployee extends ColaEmployee{
	
	int monthSalary;
	double Commission;
	
	public SalesEmployee(String name,int birthday,int monthSalary,double commission) {
		
		super(name,birthday);
		this.monthSalary = monthSalary;
		this.Commission = commission;
	}
	
	public double getSalary(int month) {
		
		if(super.birthday == month) {
			return monthSalary*Commission + 100;
		}else {
			return monthSalary*Commission;
		}
	}
}
