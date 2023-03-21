package com.prowings.classObject;

public class LIC {

	int id;
	String name;
	int age;
	String policyName;
	int amount;
	int year;

	public LIC(int iD, String name, int age, String policyName, int amount, int year) {
		super();
		id = iD;
		this.name = name;
		this.age = age;
		this.policyName = policyName;
		this.amount = amount;
		this.year = year;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (name + " :name\n" + id + " :iD\n" + age + " :age\n" + policyName + ": policyName\n" + amount
				+ " :amount\n" + year + " :year");
	}

	public static void main(String[] args) {
		LIC obj = new LIC(1019, "Lala", 40, "Gold", 50000, 2040);
		System.out.println(obj);
	}

}
