package com.pandiaaman.springcore2024.standalonecollections;

import java.util.List;
//import java.util.Map;
//import java.util.Set;

public class Person {

	private int personId;
	
	private String personName;
	
	private List<String> personFriends;
//	private Set<String> personPhoneNumbers;
//	
//	private Map<String, Integer> personMarks;

	public Person(int personId, String personName, List<String> personFriends) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personFriends = personFriends;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public List<String> getPersonFriends() {
		return personFriends;
	}

	public void setPersonFriends(List<String> personFriends) {
		this.personFriends = personFriends;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personFriends=" + personFriends + "]";
	}
	
	

	
	
}
