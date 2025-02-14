package com.tasmia.touhid.spring.jdbc.crud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.tasmia.touhid.spring.jdbc.crude.conf.ApplicationConfiguration;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		JdbcTemplate myJdbcTemplate = (JdbcTemplate) context.getBean("myJdbcTemplate");
		
//		List<Student> studentList = new ArrayList<Student>();
//		studentList.add(new Student(1104001, "ABC", 1.5f));
//		studentList.add(new Student(1104002, "EFG", 4.5f));
//		studentList.add(new Student(1104003, "EFG", 4.5f));
//		studentList.add(new Student(1104004, "EFG", 4.5f));
//		studentList.add(new Student(1104005, "EFG", 4.5f));
//		studentList.add(new Student(1104006, "EFG", 4.5f));
//		studentList.add(new Student(1104007, "EFG", 4.5f));
//
//		String sql = "INSERT INTO student (roll, name, marks) VALUES (?, ?, ?)";
//		
//		studentList.forEach((student) -> {
//            int count=myJdbcTemplate.update(sql,student.getRoll(),student.getName(),student.getMarks());
//            if(count >0 )
//            {
//            	System.out.println("Inserted successfully "+count);
//            }
//		});
		
//		String update_sql = "UPDATE  student SET name=? WHERE id=?";
//        int is_updated=myJdbcTemplate.update(update_sql,"Touhidul",2);
//        if(is_updated > 0)
//        {
//        	System.out.println("Updated successfully ");
//        }else
//        {
//        	System.out.println("Updated fail ");
//        }
        
//        String delete_sql = "DELETE FROM student  WHERE id=?";
//        int is_deleted=myJdbcTemplate.update(delete_sql,1);
//        if(is_deleted > 0)
//        {
//        	System.out.println("DELETE successfully ");
//        }else
//        {
//        	System.out.println("DELETE fail ");
//        }
		
		//String select_sql="SELECT *from student";
		//List<Student> students=myJdbcTemplate.query(select_sql, new StudentRowMapper());
		
		
		List<Student> students=new ArrayList<Student>();
		try {
			String select_sql="SELECT *from student where roll=? order by id desc  Limit 1 ";
			students=(List<Student>)myJdbcTemplate.query(select_sql, new StudentRowMapper(),1104001);
		    
		} catch (EmptyResultDataAccessException e) {
		    System.out.println("No student found with ID: 1104001");
		} catch (Exception e) {
		    e.printStackTrace(); // Print error details
		}
		
		students.forEach((student)->{
			System.out.println(student);
		});
		
		Student student=new Student();
		try {
			String select_sql="SELECT *from student where id=?";
			 student=myJdbcTemplate.queryForObject(select_sql, new StudentRowMapper(),2);
		    
		} catch (EmptyResultDataAccessException e) {
		    System.out.println("No student found with ID: 1104001");
		} catch (Exception e) {
		    e.printStackTrace(); // Print error details
		}
	    System.out.println(student);
		

	}
}
