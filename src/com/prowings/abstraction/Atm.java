package com.prowings.abstraction;

public abstract class Atm {
	public Atm() {

	}

	public boolean withdraw(int pin, int accNo, int enteredAmt) {
		int currentBal = 2000;
		if (enteredAmt <= currentBal && enteredAmt <= 10000)
			return true;
		else
			return false;
	}

	public abstract boolean changePin(int oldPin, int newPin);

	public int showBal(int pin, int accNo) {
		int currentBal = 10000;
		return currentBal;
	}

}
