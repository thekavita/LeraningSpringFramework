package com.Spring.learning.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	
	
public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigAnnotation.class);
		Student student = context.getBean("getStudent", Student.class);
		System.out.println(student);
		student.need();
		
		

}
}
