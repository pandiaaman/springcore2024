package com.pandiaaman.springcore2024.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("1")
	private int studentId;
	@Value("Aman")
	private String studentName;

	//to update the collection as a value in the @value parameter, we create a standalone collection in xml file
	@Value("#{studentPhones}")
	private List<String> studentPhones;
	
	public Student(int studentId, String studentName, List<String> studentPhones) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhones = studentPhones;
	}

	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<String> getStudentPhones() {
		return studentPhones;
	}

	public void setStudentPhones(List<String> studentPhones) {
		this.studentPhones = studentPhones;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhones=" + studentPhones
				+ "]";
	}
	
	
}
