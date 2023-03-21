package com.prowings.practice;

public class TestCarEngine {

	public static void main(String[] args) {
		Engine obj=new Engine();
		Car obj1=new Car(obj);
		
		obj1.move();

	}

}
