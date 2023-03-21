package com.prowings.practice;

public class TestHierarchical {
public static void main(String[] args) {
	Child1 obj1=new Child1();
	Child2 obj2=new Child2();
	Child3 obj3=new Child3();
	
	System.out.println("Hierarchical inheritance in java ex :");
	System.out.println("parentNum * childNum1 = "+(obj1.baseNum*obj1.childNum1));
	System.out.println("parentNum * childNum2 = "+(obj2.baseNum*obj2.childNum2));
	System.out.println("parentNum * childNum3 = "+(obj3.baseNum*obj3.childNum3));
}
}
