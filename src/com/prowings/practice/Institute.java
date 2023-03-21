package com.prowings.practice;

import java.util.List;

public class Institute {
	String name;
	
	private List<Departments>departments;
	public Institute(String name, List<Departments> departments) {
		super();
		this.name = name;
		this.departments = departments;
	}
	
	public int getTotalStudentsInstitute() {
		int noOfStudents=0;
		List<Student>students;
		for(Departments dept:departments) {
			students=dept.getStudents();
			for(Student s:students) {
				noOfStudents++;
			}
		}
		return noOfStudents;
	}
	public int getTotalDept() {
		System.out.println("dept are");
		return 2;
	}

}
