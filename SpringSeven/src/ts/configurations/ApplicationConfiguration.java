package ts.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ts.main.classes.Address;
import ts.main.classes.Student;

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
	public Student CreateStudent()
	{
		Student student=new Student();
		student.setName("Touhidul Islam");
		student.setRoll(1104011);
		student.setAddress(createAddress());
		
		return student;
	}
	
	@Bean
	public Address createAddressByConstructor()
	{
	     return new Address(103,"pabna",1264);	
	}
	
	@Bean
	public Student createStudentByConstructor()
	{
		return new Student(1104012,"Touhidul Ali",createAddressByConstructor());
	}

}
