package com.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.enc.students.Student;

@Configuration
public class ApplicationConfiguration {

	    @Bean
	    public Student st1() {
	        
	    	Student student=new Student();
	    	student.setName("Touhidul");
	    	student.setRollno(1104011);
	    	student.setEmail("touhidul@email.com");
	        
	    	return student;
	    }
	    
	    @Bean("student2")
       public Student st2() {
	        
	    	Student student=new Student();
	    	student.setName("Touhidul2");
	    	student.setRollno(1104012);
	    	student.setEmail("touhidul2@email.com");
	        
	    	return student;
	    }
}
