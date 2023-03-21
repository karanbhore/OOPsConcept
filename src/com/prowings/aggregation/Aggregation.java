package com.prowings.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Aggregation {
	public static void main(String[] args) {
		Student s1 = new Student("Mia", 1, "CSE");
		Student s2 = new Student("Rekha", 1, "CSE");
		Student s3 = new Student("John", 3, "EE");
		Student s4 = new Student("rahul", 4, "EE");

		List<Student> cse_student = new ArrayList<Student>();
		cse_student.add(s1);
		cse_student.add(s2);

		List<Student> ee_student = new ArrayList<Student>();
		ee_student.add(s4);
		ee_student.add(s3);

		Department CSE = new Department("CSE", cse_student);
		Department EE = new Department("EE", ee_student);

		List<Department> departments = new ArrayList<Department>();
		departments.add(EE);
		departments.add(CSE);

		InstituteName institute = new InstituteName("BITS", departments);

		System.out.println(institute.getTotalStudentsInstitute());
	}
}
