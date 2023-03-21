package com.prowings.overloading;

public class MethodOverloading1 {
	private static void display(int a) {
		System.out.println("got Integer data");
	}

	private static void display(String a) {
		System.out.println("got String object");
	}

	public static void main(String[] args) {
		display(1);
		display("Hello");
	}
}
