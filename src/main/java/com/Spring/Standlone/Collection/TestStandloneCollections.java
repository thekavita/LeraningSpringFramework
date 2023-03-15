package com.Spring.Standlone.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandloneCollections {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Spring/Standlone/Collection/StandloneConfig.xml");
      Person p1 = (Person) context.getBean("person1");
		System.out.println(p1);
		System.out.println(p1.getCourseFee().getClass().getName());
		System.out.println(p1.getFriend().getClass().getName());
		
	}

}
