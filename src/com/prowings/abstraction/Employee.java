package com.prowings.abstraction;

public class Employee extends Person {

	public Employee(String name, float height, int weight, int age) {
		super(name, height, weight, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isValidAge() {
		if (age >= 18)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Employee obj = new Employee("Ram", 6.7f, 67, 18);
		obj.printPersonInfo();
		System.out.println(obj.isValidAge());	
	}

}
