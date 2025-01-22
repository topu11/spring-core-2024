package ts.main.classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ts.configurations.ApplicationConfiguration;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		Student student=(Student)context.getBean("CreateStudent");
		student.display();
		System.out.println(student.getAddress());
		
		Student student1=(Student)context.getBean("createStudentByConstructor");
		student1.display();
		System.out.println(student1.getAddress().getHouseno());
		
	}

}
