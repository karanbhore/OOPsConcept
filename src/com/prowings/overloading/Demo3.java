package com.prowings.overloading;

public class Demo3 {

	public static void main(String[] args) {
		System.out.println("inside main1");
		
	}

	public static void main(String arg1) {
		System.out.println("inside main2"+arg1);
		Demo3.main("Hello"+"Hi");
		
	}

	public static void main(String arg1, String arg2) {
		System.out.println("inside main3"+arg1+""+","+arg2);
		
	}
}
