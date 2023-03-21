package com.prowings.overloading;

public class MethodOverloading2 {
	private String formatNumber(int value) {
		return String.format("%d", value);
	}

	private String formatNumber(double value) {
		return String.format("%.3f", value);
	}

	private String formatNumber(String value) {
		return String.format("%0.2f", Double.parseDouble(value));

	}

	public static void main(String[] args) {
		MethodOverloading2 obj = new MethodOverloading2();

		System.out.println(obj.formatNumber("550"));
		System.out.println(obj.formatNumber(500));
		System.out.println(obj.formatNumber(89.9955));

	}
}
