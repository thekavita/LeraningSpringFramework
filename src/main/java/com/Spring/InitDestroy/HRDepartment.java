package com.Spring.InitDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HRDepartment implements InitializingBean , DisposableBean {
	private String Salary;

	public HRDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "HRDepartment [Salary=" + Salary + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initalizing method");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying Method");
	}
	
	
	

}
