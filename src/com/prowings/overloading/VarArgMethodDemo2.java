package com.prowings.overloading;

public class VarArgMethodDemo2 {

	public static void add(int ...num) {
		System.out.println("inside add(int ...num)method");
     int result=0;
     for(int i=0;i<=num.length;i++) {
    	 System.out.println(num[i]);
    	result+=num[i]; 
     }
     System.out.println(result);
		
		
	}
//	public static void add(int num1) {
//		System.out.println("inside add(int num1)method");
//	}
//	public static void add(long num1) {
//		System.out.println("inside add(long num1)method");
//	}
//	public static void add(Integer num1) {
//		System.out.println("inside add(Integer num1)method");
//	}
	public static void add(int num1,int num2) {
		System.out.println("inside add(int num1,int num)method");
	}
	public static void main(String[] args) {
		add(10,20,30);
	}
	
	
}
