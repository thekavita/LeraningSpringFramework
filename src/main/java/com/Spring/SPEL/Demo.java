package com.Spring.SPEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+33}")
	private int x;
	
	@Value("#{8 > 6 ? 88 : 23}")
	private int y;
	
	@Value("#{ T(java.lang.Math).sqrt(64)}") // T(class).method(parameter)
	private double z;
	
	@Value("#{  new java.lang.String('Kavita Raikwar')}")   // new object(value) 
	private String name;
	
	
	@Value("#{ 8 > 1}")
	private boolean isActive;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public boolean isActive() {   
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + ", isActive=" + isActive + "]";
	}
	
	
	
}
