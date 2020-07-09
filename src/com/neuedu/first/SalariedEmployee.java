package com.neuedu.first;

public class SalariedEmployee extends ColaEmployee{

	int Salary;
	
	public SalariedEmployee(String name,int birthday,int salary) {
		super(name,birthday);
		this.Salary = salary;
	}
	
	public double getSalary(int month) {
		if(super.birthday == month) {
			return Salary + 100;
		}else {
			return Salary;
		}
	}
}
