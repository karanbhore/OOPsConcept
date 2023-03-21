package com.prowings.classObject;

public class Student {

	int rollNum;
	String name;
	int marks;
	String city;

	public Student(int rollNum, String name, int marks, String city) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.marks = marks;
		this.city = city;
	}

	@Override
	public String toString() {
		System.out.println("This Student having");
		return ("RollNum : " + rollNum + " \n name : " + name + "\n  marks : " + marks + "\n city : " + city);
	}

	public static void main(String[] args) {
		Student obj = new Student(1, "Ram", 90, "Pune");
		System.out.println(obj.toString());

	}

}
