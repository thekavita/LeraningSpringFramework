package com.Spring.learning.Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JavaConfigAnnotation {
	
	@Bean
	public book getBook2() {
		return new book();
	}
	
	@Bean
	public Student getStudent() {
		Student s1 = new Student(getBook2());
		return s1;
	}
	

}
