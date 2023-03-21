package com.prowings.classObject;

public class Employee {

	int ID;
	String name;
	String dept;
	int salary;

	public Employee(int iD, String name, String dept, int salary) {
		super();
		ID = iD;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("name : " + name + " \ndept : " + dept + " \nsalary : " + salary);
	}

	public static void main(String[] args) {
		Employee obj = new Employee(4, "Karan", "IT", 100000);
		System.out.println(obj);
//		System.out.println(obj.toString());
	}

}
