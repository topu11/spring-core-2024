package com.resources;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.configurations.ApplicationConfiguration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		Student student=(Student)context.getBean("CreateStudent");
		student.display();
		System.out.println(student.getAddress());
		System.out.println(student.getCourses().getStudentCourses());
		

	}

}
