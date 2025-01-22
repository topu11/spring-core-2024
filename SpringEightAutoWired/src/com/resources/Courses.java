package com.resources;

import java.util.List;

public class Courses {
  private List<String> studentCourses; // Corrected declaration

  // Getter
  public List<String> getStudentCourses() {
      return studentCourses;
  }

  // Setter
  public void setStudentCourses(List<String> studentCourses) {
      this.studentCourses = studentCourses;
  }

	@Override
	public String toString() {
		return "[" + studentCourses + "]";
	}
  
  
}
