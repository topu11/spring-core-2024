package com.tasmia.touhid.spring.jdbc.crude.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class ApplicationConfiguration {
  
	@Bean
	public DriverManagerDataSource mydriverManagerDataSource()
	{
		DriverManagerDataSource mydriverManagerDataSource=new DriverManagerDataSource();
		mydriverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		mydriverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/spring_stu");
		mydriverManagerDataSource.setUsername("root");
		mydriverManagerDataSource.setPassword("agc##");
		//mydriverManagerDataSource.setSchema("spring_stu");
		
		return mydriverManagerDataSource;
	}
	@Bean
	public JdbcTemplate myJdbcTemplate()
	{
		JdbcTemplate myJdbcTemplate=new JdbcTemplate();
		myJdbcTemplate.setDataSource(mydriverManagerDataSource());
		
		return myJdbcTemplate;
		
	}
  
}
