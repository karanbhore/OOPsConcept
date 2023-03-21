package com.prowings.classObject;

public class Professor {

	int ID;
	String name;
	String qualification;
	int experience;
	String dept;

	public Professor(int iD, String name, String qualification, int experience, String dept) {
		super();
		ID = iD;
		this.name = name;
		this.qualification = qualification;
		this.experience = experience;
		this.dept = dept;
	}

	@Override
	public String toString() {
		System.out.println("Hello I am a Professor!!!");
		return ("name " + name + "\n ID " + ID + "\n qualification " + qualification + "\n experience " + experience
				+ "\n dept " + dept);
	}

	public void teach() {
		System.out.println("Good Teacher");
	}

	public void eat() {
		System.out.println("eats Healthy");
	}

	public static void main(String[] args) {
		Professor obj = new Professor(1, "Ramesh", "SoftwareEngineer", 10, "IT");

		System.out.println(obj.toString());
		obj.teach();
		obj.eat();
	}

}
