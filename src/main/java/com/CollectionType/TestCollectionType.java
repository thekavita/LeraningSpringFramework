package com.CollectionType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollectionType {
   public static void main(String[] args) {
	ApplicationContext context =   new ClassPathXmlApplicationContext("com/CollectionType/Collec.xml");
    Person p1 = (Person)context.getBean("person");
    System.out.println(p1);
    System.out.println(p1.getMap());
    System.out.println(p1.getSet());
    System.out.println(p1.getList());
   }
}
