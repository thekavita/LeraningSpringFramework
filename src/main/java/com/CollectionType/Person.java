package com.CollectionType;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
	
	private String name;
	private String Add;
	private List<String>list;
	private Set<String>set;
	private Map<String, String>map;
	
	
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		Add = add;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", Add=" + Add + ", list=" + list + ", set=" + set + ", map=" + map + "]";
	}
	
	
	

}
