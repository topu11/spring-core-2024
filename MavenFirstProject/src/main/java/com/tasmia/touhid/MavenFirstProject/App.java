package com.tasmia.touhid.MavenFirstProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.tasmia.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       String ContextPath="/com/tasmia/configuration/ApplicationContext.xml";
		 
		ApplicationContext context = new ClassPathXmlApplicationContext(ContextPath);

	        // Get the User bean from the context
	        Student student = (Student) context.getBean("main_student");
	        
	        Student student1 = (com.tasmia.beans.Student) context.getBean("main_student_2");
	        
	        System.out.println(student1);
	        
    }
}
