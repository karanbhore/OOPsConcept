package com.prowings.practise;

public class TestAggregation {
	public static void main(String[] args) {
		
		Engine engine=new Engine(1.2f, 1200, 4);
		Engine engine1=new Engine(1.5f, 1500, 4);
		
		Car car1=new Car("KIA", engine, 2021);
		System.out.println(car1);
		
		Car car2=new Car("HONDA", engine1, 2023);
		System.out.println(car2);
	}

}
