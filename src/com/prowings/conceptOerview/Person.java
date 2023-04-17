package com.prowings.conceptOerview;

public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Person person1 = new Person("Sham", 20);
		Person person2 = new Person("Ram", 30);
		
		System.out.println(person2 );
		System.out.println(person1 );

	}
}
