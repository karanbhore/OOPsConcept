package com.prowings.overloading;

public class Demo1 {
	 static double result;

	public static void add(int a, int b) {
		System.out.println(result = a + b);
	}

	public static void add(int a, double b) {
		System.out.println(result = a + b);
	}

	public static void add(double a, int b) {
		System.out.println(result = a + b);
	}

	public static void add(double a, double b) {
		System.out.println(result = a + b);
	}

	public static void main(String[] args) {
		Demo1.add(20, 20);
		Demo1.add(50, 400);
		Demo1.add(25, 30.5);
		Demo1.add(55, 440);

	}
}
