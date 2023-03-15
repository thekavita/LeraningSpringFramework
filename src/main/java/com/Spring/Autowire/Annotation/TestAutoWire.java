package com.Spring.Autowire.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {

	public static void main(String[] args) {
		
	ApplicationContext context =	new ClassPathXmlApplicationContext("com/Spring/Autowire/Annotation/AutoConfig.xml");
     
	Emp e1 = (Emp) context.getBean("emp");
	System.out.println(e1);
	}

}
