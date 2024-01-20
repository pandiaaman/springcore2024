package com.pandiaaman.springcore2024.lifecycle;

public class Samosa {

	private double price;

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("inside init method");
	}
	
	public void destroy() {
		System.out.println("inside destroy method");
	}
	
}
