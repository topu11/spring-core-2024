package com.enc.students;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configurations.ApplicationConfiguration;



public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		Student student = (Student) context.getBean("st1");
		
		System.out.println(student);
		System.out.println(student.getName());
		System.out.println(((Student) context.getBean("student2")).getName());
	}

}
