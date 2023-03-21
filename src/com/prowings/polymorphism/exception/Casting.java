package com.prowings.polymorphism.exception;

public class Casting {

	public static void main(String[] args) {
//		Animal animal=new Animal();
//		Dog dog1=(Dog)animal; //downcasting
		
		Dog dog=new Dog();
		Animal animal2=dog; //upcasting
		System.out.println(animal2);
	}
}
