package com.prowings.abstraction;

public class Y extends Z {

	@Override
	public String m3() {
		System.out.println("inside Y: m3");
		return null;
	}

	public static void main(String[] args) {
		Y obj = new Y();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
