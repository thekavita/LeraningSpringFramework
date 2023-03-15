package com.Spring.DependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Spring/DependencyInjection/config.xml");
		Student student1 = (Student) context.getBean("student1");
		
		 System.out.println(student1);
		
		
		 System.out.println(context.getBean("student2"));
	}

}
