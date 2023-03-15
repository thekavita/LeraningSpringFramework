package com.Spring.SPEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/Spring/SPEL/SpelConfig.xml");
	   
		Demo d1 = (Demo) con.getBean("demo", Demo.class);
		System.out.println(d1);
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression exp = temp.parseExpression("99+1");
		System.out.println(exp.getValue());
	}

}
