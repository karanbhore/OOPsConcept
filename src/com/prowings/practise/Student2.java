package com.prowings.practise;

public class Student2 {
	
	StudentId id;
	String name;
	float marks;
	Address address;
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student2(String name, float marks, Address address) {
		super();
		this.name = name;
		this.marks = marks;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}
}
