package com.SpringCons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCons {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCons/Cons.xml");
	Teacher t1 = (Teacher)context.getBean("teacher");
	System.out.println(t1);

	}

}
