package com.Spring.InitDestroy;

//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {

	private String Subject;

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	@Override
	public String toString() {
		return "Example [Subject=" + Subject + "]";
	}
	
	@PostConstruct
	public void Start() {
		System.out.println("Staring method");
	}
	
	@PreDestroy
	public void end(){
		System.out.println("Ending method");
	}
}
