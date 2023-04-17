package com.prowings.conceptOerview;

public class Rectangle {

	public static void main(String[] args) {
		int width;
		int hwight;

		area(4, 6);
		perimeter(4, 6);

	}

	private static void perimeter(int width, int height) {

		int res = width * height;
		System.out.println("area of rectangle is :" + res);

	}

	private static void area(int width, int height) {

		int res = 2 * (width + height);
		System.out.println("perimeter of rectangle is :" + res);

	}

}
