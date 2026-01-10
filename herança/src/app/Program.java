package app;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account("Alex", 1001, 0.0);
		BusinessAccount bacc = new BusinessAccount("Maria", 1002, 0.0, 500.0);
		
		//UPCASTING 
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount("Bob", 1003, 0.0, 300.0);
		Account acc3 = new SavingAccount("José", 1004, 0.0, 0.01);
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		
	}
}
