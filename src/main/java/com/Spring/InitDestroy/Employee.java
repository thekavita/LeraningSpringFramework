package com.Spring.InitDestroy;

public class Employee {
	
	private int Salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		System.out.println("Setting value");
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Salary=" + Salary + "]";
	}
	
	
	public void init() {
		System.out.println("Calling Init method");
	}

	public void destroy() {
		System.out.println("Calling Destroy method");
	}
}
