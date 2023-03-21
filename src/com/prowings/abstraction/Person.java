package com.prowings.abstraction;

public abstract class Person {
	String name;
	float height;
	int weight;
	int age;
	String country = "India";

	public Person(String name, float height, int weight, int age) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}

	public abstract boolean isValidAge();

	public void printPersonInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.height);
		System.out.println(this.weight);
		System.out.println(this.country);

	}

}
