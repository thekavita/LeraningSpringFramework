package com.Spring.InitDestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInitMethod {

	public static void main(String[] args) {
		
	AbstractApplicationContext  context = new ClassPathXmlApplicationContext("com/Spring/InitDestroy/InitDes.xml");
	context.registerShutdownHook();
//	Employee e1 = (Employee)context.getBean("emp");
//	System.out.println(e1);
//	 
//	HRDepartment h1 = (HRDepartment) context.getBean("Hr");
//	
//	System.out.println(h1);
	
	System.out.println( context.getBean("ex"));
	
	}

}
