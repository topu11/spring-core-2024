package pb.enc.studenthome;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ContextPath="/pb/enc/configuration/applicationContext.xml";
		 
		
		ApplicationContext context = new ClassPathXmlApplicationContext(ContextPath);

	        // Get the User bean from the context
	        Student student = (Student) context.getBean("main_student");
	        Student student1 = (Student) context.getBean("main_student_2");
	        // Print user details
	        System.out.println(student);
	        System.out.println(student.getName());
	        
	        System.out.println(student1);
	        System.out.println(student1.getName());
	}

}
