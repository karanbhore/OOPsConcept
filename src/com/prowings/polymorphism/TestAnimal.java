package com.prowings.polymorphism;

public class TestAnimal {
	public static void main(String[] args) {
		Animal myAnimal=new Animal();
		Animal mypig=new Pig();
		Animal myDog=new Dog();
		
		myAnimal.animalSound();
		myDog.animalSound();
		mypig.animalSound();
		
	}

}
