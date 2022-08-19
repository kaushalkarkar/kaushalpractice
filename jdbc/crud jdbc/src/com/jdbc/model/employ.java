package com.jdbc.model;

public class employ {

	private static int employeeId;
	private static String employeeName;
	private static String employeeAddress;
	private static double employeeSalary;
	
	
	
	public employ(String employeeName, String employeeAddress, double employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeSalary = employeeSalary;
	}
	
	
	public employ(int employeeId, String employeeName, String employeeAddress, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeSalary = employeeSalary;
	}


	


	public static int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public static String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public static String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public static double getEmployeeSalary() {
		
			return employeeSalary;
		
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
	
}

