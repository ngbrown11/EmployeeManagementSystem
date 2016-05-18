package io.github.ngbrown11.database.employee;

public class Wage {
	
	int salary = 0;
	double hourly = 0.00;
	int employeeNumber;
	
	public Wage(int employeeNum, int salMoney) {
		
		employeeNumber = employeeNum;
		salary = salMoney;
	}
	
	public Wage(int employeeNum, double hourMoney) {
		
		employeeNumber = employeeNum;
		hourly = hourMoney;
	}
	
	int getSalaryPay() {
		
		return this.salary;
	}
	
	double getHourlyPay() {
		
		return this.hourly;
	}
	
}
