package com.prowings.overloading;

public class Student {
	public void StudentId(String name, int roll_no) {
		System.out.println("Name : " + name + " " + "Roll-No : " + roll_no);
	}

	public void StudentId(int roll_no, String name) {
		System.out.println("Name : " + name + "\n " + "Roll-No : " + roll_no);
	}

	public static void main(String[] args) {
		Student obj = new Student();

		obj.StudentId(2, "raj");
		obj.StudentId("Nadu", 20);
	}
}
