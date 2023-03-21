package com.prowings.overloading;

public class MethodOverloading {
	private static void display(int a) {
		System.out.println("arguments :" + a);
	}

	private static void display(int a, int b) {
		System.out.println("arg : " + a + "and" + b);
	}

	public static void main(String[] args) {
		display(1);
		display(1, 4);
	}
}
