package com.prowings.practise;

public class Student {
	private int rollNumber;
	private String name;
	private float marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNumber, String name, float marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "student[rollNumber="+rollNumber+",name="+name+",marks="+marks+"]";
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public float getMarks() {
		float convertedMarks = this.marks - 10;
		return convertedMarks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

}
