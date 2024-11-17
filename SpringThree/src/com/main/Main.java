package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Employee;
import com.beans.Student;
import com.xml.configuration.ApplicationConfiguration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String ContextPath="/com/xml/configuration/applicationConfiguration.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(ContextPath);
		
		//System.out.println((Student) context.getBean(Student.class));
		
		
		ApplicationContext contextClass = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		//System.out.println((Employee) contextClass.getBean(Employee.class));
		
		System.out.println((Student) contextClass.getBean(Student.class));
		System.out.println((Employee) context.getBean(Employee.class));
		Employee employee=(Employee) context.getBean(Employee.class);
		System.out.println(employee.getName());
	}

}
