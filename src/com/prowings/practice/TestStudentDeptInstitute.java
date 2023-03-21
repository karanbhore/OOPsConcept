package com.prowings.practice;

import java.util.ArrayList;
import java.util.List;

public class TestStudentDeptInstitute {
	public static void main(String[] args) {
		Student s1 = new Student("Rajesh", 1, "CSE");
		Student s2 = new Student("Abhi", 2, "CSE");
		Student s3 = new Student("Ganesh", 3, "CSE");
		Student s4 = new Student("Shila", 4, "EEE");

		List<Student> cse_Students = new ArrayList<Student>();
		cse_Students.add(s4);
		cse_Students.add(s3);

		List<Student> ee_Students = new ArrayList<Student>();
		ee_Students.add(s2);
		ee_Students.add(s1);

		Departments CSEobj = new Departments("CSE", cse_Students);
		Departments EEobj = new Departments("EE", ee_Students);

		List<Departments> departments = new ArrayList<Departments>();
		departments.add(CSEobj);
		departments.add(EEobj);

		Institute instituteObj = new Institute("PDEA", departments);
		

System.out.println("This is PDEA College!!!");
		System.out.println("CSE & EE Dept are in college");
		System.out.println("Total Student in Institute!!!");
		System.out.println(instituteObj.getTotalStudentsInstitute());
		System.out.println(instituteObj.getTotalDept());

	}

}
