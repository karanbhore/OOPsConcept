package com.prowings.practice;

public class ChildOfMultipleInheritances extends Three {
      @Override
	public void print() {
		System.out.println("o/p of interface i1 implemetation");
	}

	@Override
	public void print2() {
		System.out.println("o/p of abstract class B1");
	}

	@Override
	public void print1() {
		System.out.println("o/p of abstract class Three");
	}
	public static void  display() {
		System.out.println("this is ex of multiple inheritance which achieved by one interface two abstract classes :");
			
	}

}
