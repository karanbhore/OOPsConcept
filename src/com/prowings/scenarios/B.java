package com.prowings.scenarios;

public class B extends A {
	public void method1() {
		System.out.println("in B method1");
	}
	public static void main(String[] args) {

		A a = new B();
		a.method1();
	}
	
}
