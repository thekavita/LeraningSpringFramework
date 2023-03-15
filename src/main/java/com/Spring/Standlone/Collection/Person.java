package com.Spring.Standlone.Collection;

import java.util.List;
import java.util.Map;

public class Person {
	
	private List<String>friend;
	private Map<String , Integer>courseFee;
	public List<String> getFriend() {
		return friend;
	}
	public void setFriend(List<String> friend) {
		this.friend = friend;
	}
	public Map<String, Integer> getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(Map<String, Integer> courseFee) {
		this.courseFee = courseFee;
	}
	@Override
	public String toString() {
		return "Person [friend=" + friend + ", courseFee=" + courseFee + "]";
	}
	
	

}
