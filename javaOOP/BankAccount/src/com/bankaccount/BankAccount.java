package com.bankaccount;

public class BankAccount {

// Attributes
	private String accountNumber = "";
	private double checkingBalance = 0.0;
	private double savingsBalance = 0.0;
	private static int accountsCreated = 0;
	private static double totalBalance = 0.0;

// Constructors
	public BankAccount() {
		this.accountNumber = newAccountNumber();
		this.checkingBalance = 0.0;
		this.savingsBalance = 0.0;
		accountsCreated += 1;
	}

//Getter
	public double getcheckingBalance() {
		return checkingBalance;
	}

	public double getsavingsBalance() {
		return savingsBalance;
	}

//Setter
	public void setcheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public void setsavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

//Methods

	private String newAccountNumber() {

		String randomNumber = "";
		for (int i = 0; randomNumber.length() < 10; i++) {
			randomNumber += Math.ceil(Math.random() * 100);
		}
		return randomNumber.substring(0, 10);
	}

	public void depositMoney(String accountType, double amount) {
		if (accountType.equals("saving")) {
			savingsBalance += amount;
			totalBalance += amount;
		} else if (accountType.equals("checking")) {
			checkingBalance += amount;
			totalBalance += amount;
		}
	}

	public void withdrawMoney(String accountType, double amount) {
		if (accountType.equals("saving") || savingsBalance >= amount) {
			savingsBalance -= amount;
			totalBalance -= amount;
		} else if (accountType.equals("checking") && checkingBalance >= amount) {
			checkingBalance -= amount;
			totalBalance -= amount;
		}
	}

	public double totalBalance() {
		double totalBalance = checkingBalance + savingsBalance;
		System.out.println(totalBalance);
		return totalBalance;

	}
}