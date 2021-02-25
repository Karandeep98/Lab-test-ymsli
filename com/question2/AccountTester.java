package com.question2;


public class AccountTester {
	public static void main(String[] args) {
		
		Date date = new Date(04,11,1998);
		Owner owner = new Owner("Karandeep", "1411", date);
		
		SavingAccount account = new SavingAccount();
		account.setBalance(10000);
		account.setNumber("2453456764");
		account.setOwner(owner);
		account.setInterestRate(5);
		account.print();
		account.deposit(500);
		account.withdraw(500.50f);
		
		CurrentAccount account2 = new CurrentAccount();
		account2.setBalance(50000);
		account2.setOwner(owner);
		account2.setNumber("45371798324");
		account2.setMinimumBalance(10000);
		account2.print();
		
		account2.withdraw(45000);
		account2.withdraw(40000);
		account2.deposit(15000);
		
		
	}
}
