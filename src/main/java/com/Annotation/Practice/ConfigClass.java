package com.Annotation.Practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.Annotation.Practice")
public class ConfigClass {
	
	
	// @Bean
	public Menu display() {
		return new Menu();
	}
	
	// @Bean
	public Restaurant run(){
		Restaurant r1 = new Restaurant(display());
		return r1;
	}
	

}
