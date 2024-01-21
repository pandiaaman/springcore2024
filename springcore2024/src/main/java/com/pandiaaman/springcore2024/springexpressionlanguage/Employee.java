package com.pandiaaman.springcore2024.springexpressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {

	@Value("Aman")
	private String empName;
	
	@Value("#{5+15}")
	private int x;
	
	@Value("#{5>2?12:00}")
	private int y;
	
	//invoking static and variables using spring expression language
	
	@Value("#{T(java.lang.Math).sqrt(64)}")
	private int staticMethodUsingSEL;
	
	@Value("#{T(java.lang.Math).PI}")
	private int variableUsingSEL;

	public Employee(String empName) {
		super();
		this.empName = empName;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Employee(String empName, int x, int y) {
		super();
		this.empName = empName;
		this.x = x;
		this.y = y;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public int getStaticMethodUsingSEL() {
		return staticMethodUsingSEL;
	}

	public void setStaticMethodUsingSEL(int staticMethodUsingSEL) {
		this.staticMethodUsingSEL = staticMethodUsingSEL;
	}

	public int getVariableUsingSEL() {
		return variableUsingSEL;
	}

	public void setVariableUsingSEL(int variableUsingSEL) {
		this.variableUsingSEL = variableUsingSEL;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", x=" + x + ", y=" + y + ", staticMethodUsingSEL="
				+ staticMethodUsingSEL + ", variableUsingSEL=" + variableUsingSEL + "]";
	}
	
	
}
