package com.prowings.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Student {
	String name;
	int id;
	String dept;

	public Student(String name, int id, String dept) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
}

class Department {
	String name;
	private List<Student> Students;

	public Department(String name, List<Student> students) {
		super();
		this.name = name;
		Students = students;
	}

	public List<Student> getStudents() {
		return Students;
	}
}

class InstituteName {
	String instituteName;
	private List<Department> departments;

	public InstituteName(String instituteName, List<Department> departments) {
		super();
		this.instituteName = instituteName;
		this.departments = departments;
	}

	public int getTotalStudentsInstitute() {
		int noOfStudents = 0;
		List<Student> students;

		for (Department dept : departments) {
			students = dept.getStudents();
			for (Student s : students) {
				noOfStudents++;
			}
		}
		return noOfStudents;
	}

}
