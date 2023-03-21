package com.prowings.inheritance;

public class HierarchicalInheritance {
	public static void main(String[] args) {
		C C_obj = new C();
		C_obj.display();

		System.out.println();
		D D_obj = new D();
		D_obj.display();
	}

}

class A {
	int a = 1;
}

class B extends A {
	int b = 2;
}

class C extends B {
	int c = 3;
	int sum = a + b + c;

	public void display() {
		System.out.println("the value of a is : " + a);
		System.out.println("the value of b is : " + b);
		System.out.println("the value of c is : " + c);
		System.out.println("sum of a, b, c is : " + sum);
	}
}

class D extends B {
	int d = 4;
	int sum = a + b + d;

	public void display() {
		System.out.println("the value of a is : " + a);
		System.out.println("the value of b is : " + b);
		System.out.println("the value of d is : " + d);
		System.out.println("sum of a, b, d is : " + sum);

	}
}
