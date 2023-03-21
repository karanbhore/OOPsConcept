package com.prowings.overloading;

public class Demo2 {

	static double result;

	public static int area(int r) {
		System.out.println("area of circle");
		result = (Math.PI * r * r);
		return (int) result;
	}

	public static int area(int l, int b) {
		System.out.println("area of rectangle");
		result = l * b;
		return (int) result;
	}

	public static int area(double h, int b) {
		System.out.println("area of triangle");
		result = (b * h) / 2;
		return (int) result;
	}

	public static void main(String[] args) {

		System.out.println(Demo2.area(4));
		System.out.println(Demo2.area(5, 8));
		System.out.println(Demo2.area(8, 9));
	}
}
