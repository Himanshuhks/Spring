package com.hks.annotations;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	
	@Value("Himanshu")
	private String name;
	private String course;
	
//	public void setName(String name) {
//		this.name = name;
//	}
	@Required
	@Value("Java")
	public void setCourse(String course) {
		this.course = course;
	}
	
	public Student(String name, String course) {
		this.name = name;
		this.course = course;
	}
	public Student() {}
	public void display() {
		System.out.println(name + " -> " + course);
		
	}
	

}
