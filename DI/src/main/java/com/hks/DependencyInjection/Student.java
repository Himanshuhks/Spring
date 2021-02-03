package com.hks.DependencyInjection;

public class Student {
	
	private String name;

	public void setName(String name) {
		// setter for property tag
		this.name = name;
	}
	public void display() {
		System.out.println(name);
	}
	public Student(String name) {
		// constuctor for constuctor-arg tag
		this.name = name;
	}
	public Student() {
	}
	

}
