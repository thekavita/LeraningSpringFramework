package com.Annotation.Practice;

import org.springframework.stereotype.Component;

@Component("temp")
public class Restaurant {
	
	private Menu menu;
	
	public Restaurant(Menu menu) {
		super();
		this.menu = menu;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}


	public void order() {
		this.menu.food();
		System.out.println("what you want..you..");
	}

}
