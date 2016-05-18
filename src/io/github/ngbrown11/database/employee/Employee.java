package io.github.ngbrown11.database.employee;

public class Employee {
	
	String firstName;
	String lastName;
	int employeeNumber;
	
	Employee(String fName, String lName, int employeeNum) {
		
		firstName = fName;
		lastName = lName;
		employeeNumber = employeeNum;
	}
	
	String getEmployeeName() {
		
		String first = this.firstName;
		String last = this.lastName;
		return first + " " + last;
	}
	
	void setEmployeeName(String first, String last) {
		
		this.firstName = first;
		this.lastName = last;
	}
	
	public static void main(String[] args) {
		
		Employee a = new Employee("Nate", "Brown", 15221);
		System.out.println(a.firstName + " " + a.lastName + " #" + a.employeeNumber);
	}

}
