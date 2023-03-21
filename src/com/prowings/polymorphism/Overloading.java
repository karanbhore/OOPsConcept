package com.prowings.polymorphism;

public class Overloading {
	
	 int multiply(int a, int b) {
		return (a*b);
	}
	
	  double Multiply(double a,double b) {
		return (a*b);
	}
	
	public static void main(String[] args) {
		Overloading obj=new Overloading();
		System.out.println(obj.multiply(2, 4));
		System.out.println(obj.Multiply(5.5, 6.5));
	}
	
	

}
