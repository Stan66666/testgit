package com.neuedu.first;

public class TestCompany {

	public static void main(String[] args) {

		ColaEmployee a[] = { new SalariedEmployee("lihua", 5, 3000), new HourlyEmployee("lilei", 8, 20, 150),
				new SalesEmployee("wangwei", 10, 20000, 0.3) };
		for (int b = 0; b < a.length; b++) {
			new Company().Printing(a[b], 8);
		}

	}
}
