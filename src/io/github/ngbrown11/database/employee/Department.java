package io.github.ngbrown11.database.employee;

public class Department {
	
	String departmentName;
	int departmentNumber;
	
	Department(String deptName, int deptNum) {
		
		departmentName = deptName;
		departmentNumber = deptNum;
	}
	
	int getDepartmentNumber() {
		
		return this.departmentNumber;
	}
	
	String getDepartmentName() {
		
		return this.departmentName;
	}
	
}
