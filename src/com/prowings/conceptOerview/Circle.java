package com.prowings.conceptOerview;

public strictfp class Circle {

	static int radious;

//	public Circle() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
	public Circle(int radious) {
		super();
		this.radious = radious;
	}

	public int getRadious() {
		return radious;
	}

	public void setRadious(int radious) {
		this.radious = radious;
	}

	@Override
	public String toString() {
		return "Circle [radious=" + radious + "]";
	}

	public static void main(String[] args) {
		Circle circle = new Circle(4);
		double area = (2 * Math.PI * radious * radious);
		System.out.println("area of circle " + area);

		double circumference = (2 * Math.PI * radious);
		System.out.println("circumference of circle " + circumference);

		System.out.println(circle.getRadious());
		circle.setRadious(5);
		System.out.println("after changing radious :" + circle.getRadious());

	}
}
