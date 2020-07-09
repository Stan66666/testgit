package com.neuedu.first;

public class Company{
	
	public void Printing(ColaEmployee a,int b) {
		System.out.println(a.name + "员工在" + b + "月的工资为" + a.getSalary(b));
	}
}