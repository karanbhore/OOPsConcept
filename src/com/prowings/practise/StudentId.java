package com.prowings.practise;

public class StudentId {
	int roll;
	long mobileNumber;
	public StudentId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentId(int roll, long mobileNumber) {
		super();
		this.roll = roll;
		this.mobileNumber = mobileNumber;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "StudentId [roll="+roll+",mobileNumber="+mobileNumber+"]";
	}
	

}
