package com.prowings.conceptOerview;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Account> accounts;

	public Bank() {
		this.accounts = new ArrayList<>();
	}

	public void addAccount(Account account) {
		this.accounts.add(account);
	}

	public void removeAccount(Account account) {
		this.accounts.remove(account);
	}

	public void depositeMoney(Account account) {
		this.accounts.remove(account);
	}

	public void depositMoney(Account account, double amount) {
		account.deposit(amount);
	}

	public void iwthdrawMoney(Account account, double amount) {
		account.withdraw(amount);
	}

}
