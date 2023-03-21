package com.prowings.classObject;

public class Bank {

 double accNo;
 String name;
 String type;
 double amount;
public Bank(double accNo, String name, String type, double amount) {
	super();
	this.accNo = accNo;
	this.name = name;
	this.type = type;
	this.amount = amount;
}
 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("accNo : "+accNo+" \nname : "+name+" \ntype : "+type+" \namount : "+amount);
	}
 public static void main(String[] args) {
	Bank obj =new Bank(091710110001778d, "Rajesh", "SavingAcc", 1000000000d);
	
	System.out.println(obj);
	
}
	
	
	
	
	
	
	
	
	
	
	
	
}
