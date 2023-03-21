package com.prowings.abstraction;

public class X extends Z {

	@Override
	public String m3() {
		System.out.println("inside X: m3 ");
		return null;
	}

	public static void main(String[] args) {
		X obj = new X();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}
