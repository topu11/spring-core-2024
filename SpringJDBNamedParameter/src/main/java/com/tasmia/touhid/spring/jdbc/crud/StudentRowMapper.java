package com.tasmia.touhid.spring.jdbc.crud;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student st=new Student();
		st.setName(rs.getString("name"));
		st.setRoll(rs.getInt("roll"));
		st.setMarks(rs.getFloat("marks"));
		return st;
	}

}
