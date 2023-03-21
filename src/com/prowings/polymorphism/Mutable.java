package com.prowings.polymorphism;

public class Mutable {

	private String s;

	public Mutable(String s) {
		super();
		this.s = s;
	}

	public String getName() {
		return s;
	}

	public void setName(String courseName) {
		this.s = courseName;
	}

	public static void main(String[] args) {
		Mutable obj = new Mutable("Java");
		System.out.println(obj.getName());

		obj.setName("Java Training");
		System.out.println(obj.getName());

	}

}
