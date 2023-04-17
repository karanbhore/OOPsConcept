package com.prowings.conceptOerview;

public class Dog {

	String name;
	String breed;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + "]";
	}

	public static void main(String[] args) {
		Dog dog1 = new Dog("tyson", "doberman");
		Dog dog2 = new Dog("Ramu", "doberman");

		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println();

		dog1.setName("Tommy");
		dog2.setName("Puppy");
		System.out.println(dog1);
		System.out.println(dog2);

	}

}
