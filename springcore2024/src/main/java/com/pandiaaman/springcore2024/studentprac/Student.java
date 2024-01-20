package com.pandiaaman.springcore2024.studentprac;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	
	private int studentId;
	
	private String studentName;
	
	private List<String> studentMarks;
	
	private Set<String> studentPhones;
	
	private Map<String, String> studentOlderSchools;
	
	private Properties studentProps;
	
	private String studentAddress;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	public Student(int studentId, String studentName, List<String> studentMarks, Set<String> studentPhones,
			Map<String, String> studentOlderSchools, String studentAddress, Properties props) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
		this.studentPhones = studentPhones;
		this.studentOlderSchools = studentOlderSchools;
		this.studentAddress = studentAddress;
		this.studentProps = props;
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

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	public List<String> getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(List<String> studentMarks) {
		this.studentMarks = studentMarks;
	}

	public Set<String> getStudentPhones() {
		return studentPhones;
	}

	public void setStudentPhones(Set<String> studentPhones) {
		this.studentPhones = studentPhones;
	}

	public Map<String, String> getStudentOlderSchools() {
		return studentOlderSchools;
	}
	
	public Properties getStudentProps() {
		return studentProps;
	}

	public void setStudentProps(Properties studentProps) {
		this.studentProps = studentProps;
	}

	public void setStudentOlderSchools(Map<String, String> studentOlderSchools) {
		this.studentOlderSchools = studentOlderSchools;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ ", studentPhones=" + studentPhones + ", studentOlderSchools=" + studentOlderSchools
				+ ", studentProps=" + studentProps + ", studentAddress=" + studentAddress + "]";
	}
	
	
}
