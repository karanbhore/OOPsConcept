package com.prowings.polymorphism;

public class TestClassOuterInner {
	public static void main(String[] args) {
		OuterClass obj=new OuterClass();
		OuterClass.InnerClass innerObj=obj.new InnerClass();
		
		System.out.println("innerObj.y+obj.x = "+(innerObj.myInnerMethod()));
		
	}

}
