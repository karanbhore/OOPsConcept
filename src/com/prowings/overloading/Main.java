package com.prowings.overloading;

public class Main {

	public void substraction(int a, int b) {
		int result = a - b;
		System.out.println(result);
	}

	public void substraction(double a, double b) {
		double result = a - b;
		System.out.println(result);
	}

	public void substraction(int a, double b) {
		double result = a - b;
		System.out.println(result);
	}

	public void substraction(double a, int b) {
		double result = a - b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		Main obj = new Main();

		obj.substraction(20.25, 20.5);
		obj.substraction(20.5, 40);
		obj.substraction(40, 40);
		obj.substraction(50, 0);

	}

}
