package com.prowings.polymorphism.exception;

public class Exception {

	public static void main(String[] args) {
		System.out.println("main method started");
		try {
		int result=10/0;
		System.out.println(result);
		}
		catch(ArithmeticException obj) {
			System.out.println("can not perform ");
		}
		try {
			String name=null;
			int result=name.length();
			System.out.println(result);
		}
		catch(NullPointerException obj) {
			System.out.println("can not perform");
		}
		
//		String name=null;
//		int res=name.length();
//		System.out.println(res);
		System.out.println("main method ended");
		
	}
}
