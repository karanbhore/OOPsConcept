package com.prowings.polymorphism.exception;

import java.sql.SQLException;

public class TestException {

	public static void main(String[] args) {
		System.out.println("main method started!!!");
		try {
			mymethod();
		} catch (NullPointerException e) {
			System.out.println("Null ptr occur!!!");
		}
		System.out.println("main method ended!!!");
	}

	public static void mymethod() throws NullPointerException {
		System.out.println("my method started!!!");
		anotherMethod();
		System.out.println("myMethod ended!!!");
	}

	public static void anotherMethod() {
System.out.println("another method started!!!");
try {
	String name=null;
	int res=name.length();
	System.out.println("result is "+res);
}catch(NullPointerException e) {
	System.out.println("can not invoke null object!!!");
}
System.out.println("another method ended!!!");

		
		
	}

}
