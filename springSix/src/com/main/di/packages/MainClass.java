package com.main.di.packages;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ts.beans.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String ContextPath="/com/ts/resources/applicationContext.xml";
	   ApplicationContext context = new ClassPathXmlApplicationContext(ContextPath);
	   Student st=(Student) context.getBean("student");
	   st.display();
	}

}
