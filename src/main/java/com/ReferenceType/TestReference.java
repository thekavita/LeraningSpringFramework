package com.ReferenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReference {

	public static void main(String[] args) {
		
  ApplicationContext context = new ClassPathXmlApplicationContext("com/ReferenceType/Ref.xml");
  A a = (A)context.getBean("aref");
  System.out.println(a);
  System.out.println(a.getOb());
	}

}
