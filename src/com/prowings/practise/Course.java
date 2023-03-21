package com.prowings.practise;

public class Course {
	
	String courseName;
	int duration;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String courseName, int duration) {
		super();
		this.courseName = courseName;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", duration=" + duration + "]";
	}

	
	
	
}
