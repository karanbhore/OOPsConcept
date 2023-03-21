package com.prowings.polymorphism.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverridingDemo1 extends Parent{

//	public void m1()throws FileNotFoundException{
//		System.out.println("inside child m1()");
//		System.out.println("Hi!!!");
////		return 0;
//	}
	public static void main(String[] args) throws IOException {
		Parent p=new Parent();
		Parent p1=new OverridingDemo1();
		p1.m1();
	}
}
