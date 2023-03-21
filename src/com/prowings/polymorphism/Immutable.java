package com.prowings.polymorphism;

public class Immutable {
	private final String s;

	public Immutable(String s) {
		super();
		this.s = s;
	}
	
	public final String getName() {
		return s;
	}
	public static void main(String[] args) {
		Immutable obj=new Immutable("Core Java");
		System.out.println(obj.getName());
				
	}
	

}
