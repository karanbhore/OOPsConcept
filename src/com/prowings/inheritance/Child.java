package com.prowings.inheritance;

public class Child extends B1 implements A1 {
	@Override
	public
	void m1() {
System.out.println("inside child m1 :");		
	}

	@Override
	public
	void m2() {
System.out.println("inside child m2 :");		
	}
	public static void main(String[] args) {
		Child obj=new Child();
		obj.m1();
		obj.m2();
		
	}
	

}
