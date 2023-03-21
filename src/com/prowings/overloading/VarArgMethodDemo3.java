package com.prowings.overloading;

public class VarArgMethodDemo3 {

//	public static void add(int...num) {
//		System.out.println("inside int array");
//	}
	public static void add(long...num) {
		System.out.println("inside long array");
	}
	public static void main(String[] args) {
		int x=30;
		int y=40;
		int z=70;
		add(x,y,z);
	}
	
	
	
	
	
}
