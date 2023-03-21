package com.prowings.overloading;

public class Demo4 {
	static double result;

	public static void display(int a) {
		System.out.println(" first method");
		System.out.println(result = a);

	}

	public static void display(int a, int b) {
		System.out.println(" second method");
		System.out.println(result = a + b);
	}

	public static void display(double a) {
		System.out.println(" third method");
		System.out.println(result = a);
	}

	public static void main(String[] args) {
		Demo4.display(50.50);
		Demo4.display(4.4);
		Demo4.display(30, 20);
	}
}
