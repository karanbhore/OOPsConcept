package com.prowings.classObject;

public class Hospital {

	String patientId;
	String doctor;
	String name;
	String relative;
	public Hospital(String patientId, String doctor, String name, String relative) {
		super();
		this.patientId = patientId;
		this.doctor = doctor;
		this.name = name;
		this.relative = relative;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (patientId+" :patientId\n"+doctor+" :doctor\n"+name+" :name\n"+relative);
	}
	public static void main(String[] args) {
		Hospital obj =new Hospital("cardiacPatient", "MD", "Manoj", "Father");
		System.out.println(obj);
	}
	
	
	
	
	
	
	
	
}
