package com.ReferenceType;

public class A {
	
	private int X;
	private B ob;
	
	
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	@Override
	public String toString() {
		return "A [X=" + X + ", ob=" + ob + "]";
	}
	
	

}
