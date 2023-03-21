package com.prowings.practice;

public class TestMultipleInheritance {
	public static void main(String[] args) {
		ChildOfMultipleInheritances obj = new ChildOfMultipleInheritances();
		ChildOfMultipleInheritances.display();
		System.out.println();
		obj.print();
		obj.print1();
		obj.print2();
	}
}
