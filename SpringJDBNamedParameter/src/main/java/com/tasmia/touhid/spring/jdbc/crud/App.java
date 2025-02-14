package com.tasmia.touhid.spring.jdbc.crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.tasmia.touhid.spring.jdbc.crude.conf.ApplicationConfiguration;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		NamedParameterJdbcTemplate myJNamedParameterJdbcTemplate = (NamedParameterJdbcTemplate) context.getBean(NamedParameterJdbcTemplate.class);
		
		try {
			HashMap<String,Object> insert_map = new HashMap<String,Object>();
			insert_map.put("roll", 1104011);
			insert_map.put("name", "Abdul Ali");
			insert_map.put("marks", 4.5f);
		
			String insert_sql="INSERT INTO student (roll, name, marks) VALUES (:roll, :name, :marks)";
			int inserted=myJNamedParameterJdbcTemplate.update(insert_sql, insert_map);
			if(inserted > 0)
			{
				System.out.println("Inserted Successfully");
			}else
			{
				System.out.println("Inserted fail");
			}
		    
		} catch (DataIntegrityViolationException e) {
			System.out.println("Database constraint violation or duplicate entry.");
		} catch (Exception e) {
		    e.printStackTrace(); // Print error details
		}
		
		

	}
}
