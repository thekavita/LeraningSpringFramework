package com.SpringCons;

public class Teacher {
	
	private int id;
	private String name;
	
	

	public Teacher() {
		
	}



	public Teacher(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	@Override
	public String toString() {
		return this.id +" " +this.name;
	}
	
	

}
