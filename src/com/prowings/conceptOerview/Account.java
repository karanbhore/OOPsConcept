package com.prowings.conceptOerview;

public class Account {

	private String customerName;
	private String accountNumber;
	private double balance;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String customerName, String accountNumber, double balance) {
		super();
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > this.balance) {
			System.out.println("Insufficient balance !");

		} else {
			this.balance -= amount;
		}
	}

}
