package com.configurations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.resources.*;

@Configuration
public class ApplicationConfiguration {
	@Bean
	public Address createAddress()
	{
		Address address=new Address();
		address.setCity("pabna");
		address.setHouseno(102);
		address.setPincode(126);
		return address;
	}
	@Bean
	public Address createAddress1()
	{
		Address address=new Address();
		address.setCity("Dhaka");
		address.setHouseno(1012);
		address.setPincode(1216);
		return address;
	}
	@Bean
	public Student CreateStudent()
	{
		Student student=new Student();
		student.setName("Touhidul Islam");
		student.setRoll(1104011);
		//student.setAddress(createAddress());
		
		return student;
	}
	@Bean
	public Courses CreateCourse()
	{
		Courses courses =new Courses();
		List<String> courseList=new ArrayList<String>();
		courseList.add("physics");
		courseList.add("Chemistry");
		courseList.add("Math");
		courses.setStudentCourses(courseList);
		return courses;
		
	}
}
