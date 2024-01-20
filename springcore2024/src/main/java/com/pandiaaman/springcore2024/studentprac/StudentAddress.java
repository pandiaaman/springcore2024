package com.pandiaaman.springcore2024.studentprac;

public class StudentAddress {
	
	private String houseNumber;
	
	private String street;
	
	private String city;
	
	private int zipcode;

	public StudentAddress(String houseNumber, String street, String city, int zipcode) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}

	public StudentAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "StudentAddress [houseNumber=" + houseNumber + ", street=" + street + ", city=" + city + ", zipcode="
				+ zipcode + "]";
	}
	
	

}
