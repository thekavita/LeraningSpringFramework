package com.Spring.Auto.Wire;

public class Address {
    
	private String City;
	private String Street;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	@Override
	public String toString() {
		return "Address [City=" + City + ", Street=" + Street + "]";
	}
	
	
    
    
}
