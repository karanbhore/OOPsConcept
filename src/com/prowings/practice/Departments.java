package com.prowings.practice;

import java.util.List;

public class Departments {
	String name;
	private List<Student>students;
	
	public Departments(String name, List<Student> students) {
		super();
		this.name = name;
		this.students = students;
	}
	
	public List<Student> getStudents(){
		return students;
	}
	

}
