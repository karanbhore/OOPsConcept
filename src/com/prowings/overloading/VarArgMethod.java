package com.prowings.overloading;

public class VarArgMethod {

	public static void add(int...numbers) {
		System.out.println("inside add(int...nums)method");
		int res = 0;
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			res += numbers[i];
		}
		System.out.println("addition of var args is : " + res);

	}

	public static void add(int num) {
		System.out.println("inside add(int num)");

	}

	public static void add(int num, long... numbers) {
		System.out.println("inside add int and var arg method");
		System.out.println("num : " + num);
		System.out.println(numbers);
	}

	public static void add(int num1, int num2) {
		System.out.println("inside add(int num1,int num2)method");
		int res = num1 + num2;
		System.out.println(res);

	}

	public static void main(String[] args) {
		add(20, 30, 40);
	}

}
