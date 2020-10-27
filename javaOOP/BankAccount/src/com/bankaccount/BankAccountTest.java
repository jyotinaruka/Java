package com.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {

		BankAccount user1 = new BankAccount();
		BankAccount user2 = new BankAccount();
		BankAccount user3 = new BankAccount();

		user1.depositMoney("saving", 10.00);
		user2.depositMoney("checking", 100.00);
		user3.depositMoney("saving", 1000.00);

		user1.withdrawMoney("checking", 20.00);
		user2.withdrawMoney("checking", 200.00);
		user3.withdrawMoney("saving", 2000.00);

		user1.totalBalance();
		user2.totalBalance();
		user3.totalBalance();

	}

}
