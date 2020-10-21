package com.revature.beans;

public class Animal {
   
	//instance variables
	private String name;
	private int legs;
	private String category;
	
	//constructors
	public Animal () {}
	public Animal(String name, int legs, String category) {
		this.name=name;
		this.legs=legs;
		this.category=category;
	}
	
	// setters and getters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
