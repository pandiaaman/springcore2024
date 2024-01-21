package com.pandiaaman.springcore2024.autowire;

public class Employee {

	private int empId;
	
	private String empName;
	
	private EmpAddress empAddress;
	
	public Employee(int empId, String empName, EmpAddress empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public EmpAddress getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(EmpAddress empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}
	
	
}
