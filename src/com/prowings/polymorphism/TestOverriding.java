package com.prowings.polymorphism;

public class TestOverriding {
	
		public static void main(String[] args) {
			Overriding obj=new Overriding();
			obj.print();

			Overriding obj1=new subClass1();
			obj1.print();
			
			Overriding obj11=new SubClass123();
			obj11.print();
			
		}
	

}
