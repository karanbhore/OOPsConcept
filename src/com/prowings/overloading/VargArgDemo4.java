package com.prowings.overloading;

public class VargArgDemo4 {

	public static void add(int...num) {
		System.out.println("inside int array");
	}
	public static void add(long...num) {
		System.out.println("inside long array");
	}
	public static void main(String[] args) {
		long[] val= {100,200};
		add(val);
		
		
		
		
		
		int[]num= {10,20,30,40};
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
	}
	
	
	
	
	
	
	
}
