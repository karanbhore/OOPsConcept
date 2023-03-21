package com.prowings.abstraction;

public class TestAtmImpl {
	public TestAtmImpl() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		AtmImpl obj = new AtmImpl();
		boolean pinChanged = obj.changePin(10, 103);
		System.out.println("pinChanged :" + pinChanged);

		boolean result = obj.withdraw(123, 98765, 1200);
		System.out.println("Withdraw Amt from ATM Machin:" + result);

		int bal = obj.showBal(123, 98765);
		System.out.println("available bal is :" + bal);

	}

}
