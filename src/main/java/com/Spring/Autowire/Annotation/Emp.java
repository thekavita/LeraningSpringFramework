package com.Spring.Autowire.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("address2")
	private Address address;

	public Emp() {
		super();
		
	}
	

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println(" Constructor Autowire ");
	}


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println(" Setter Autowire ");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	

}
