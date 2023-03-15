package com.Spring.learning.Annotation;

import org.springframework.stereotype.Component;


public class Student {
	
	private book b1;
	
	public Student(book b1) {
		super();
		this.b1 = b1;
	}

	public book getB1() {
		return b1;
	}

	public void setB1(book b1) {
		this.b1 = b1;
	}
	
	public void need() {
		this.b1.price();
		System.out.println("6 book in your course");
	}

}
