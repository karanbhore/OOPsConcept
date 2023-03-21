package com.prowings.classObject;

public class Medical {

	String medicineName,company;
	int price;
	String expiryDate;
	public Medical(String medicineName, String company, int price, String expiryDate) {
		super();
		this.medicineName = medicineName;
		this.company = company;
		this.price = price;
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (medicineName+" :medicineName\n"+company+" : company\n"+price+" :price\n"+expiryDate+" :expiryDate");
	}
	public static void main(String[] args) {
		Medical obj=new Medical("paracetamol", "Alpha", 10, "12/12/2025");
		System.out.println(obj);
	}
	
	
	
	
	
	
	
	
}
