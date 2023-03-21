package com.prowings.classObject;

public class Loan {

	double accNo;
	String name;
	String loanId;
	Double amount;
	String interestRate;
	public Loan(double accNo, String name, String loanId, Double amount, String interestRate) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.loanId = loanId;
		this.amount = amount;
		this.interestRate = interestRate;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (accNo+" : accNo\n"+name+" : name\n"+loanId+" : loanId\n"+amount+" : amount\n"+interestRate+" : interestRate");
		
		
		
	}
	public static void main(String[] args) {
		Loan obj=new Loan(0123456d, "Rajesh", "Housing", 987456d, "15%");
		
		System.out.println(obj);
	}
	
	
	
	
	
	
}
