package com.Spring.Auto.Wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {

	public static void main(String[] args) {
		
	ApplicationContext context =	new ClassPathXmlApplicationContext("com/Spring/Auto/Wire/AutoConfig.xml");
     
	Emp e1 = (Emp) context.getBean("emp");
	System.out.println(e1);
	}

}
