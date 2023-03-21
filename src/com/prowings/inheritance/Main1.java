package com.prowings.inheritance;

public class Main1 {
	public static void main(String[] args) {
		SubClass1 obj1 = new SubClass1();
		SubClass2 obj2 = new SubClass2();
		SubClass3 obj3 = new SubClass3();

		System.out.println("parentNum*ChildNum1 = " + obj1.parentNum * obj1.childNum1);
		System.out.println("parentNum*ChildNum2 = " + obj2.parentNum * obj2.childNum2);
		System.out.println("parentNum*ChildNum3 = " + obj3.parentNum * obj3.childNum3);

	}

}
