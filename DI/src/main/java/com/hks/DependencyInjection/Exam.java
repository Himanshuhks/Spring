package com.hks.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = context.getBean("student",Student.class);
		student.display();
		Student student1 = context.getBean("student1",Student.class);
		student1.display();
	}
}
