package com.prowings.practice;

public final class Car {
	private final Engine engine;
	

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}
	public void move() {
		engine.work();
		System.out.println("Car is Moving!!!");
	}

}
