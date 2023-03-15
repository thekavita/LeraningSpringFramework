package com.Spring.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/Spring/Stereotype/StereoTypeConfig.xml");
		Student s1 = (Student) con.getBean("student");
//		System.out.println(s1);
//		System.out.println(s1.getList());
//		System.out.println(s1.getList().getClass().getName());
		
		Student s2 = (Student) con.getBean("student");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
