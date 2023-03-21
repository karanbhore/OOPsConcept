package com.prowings.abstraction;

public abstract class Z implements I {
	@Override
	public void m1() {
		System.out.println("inside m1");
	}

	@Override
	public int m2() {
		System.out.println("inside m2");
		return 0;
	}

}
