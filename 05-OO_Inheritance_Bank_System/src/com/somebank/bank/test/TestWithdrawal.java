package com.somebank.bank.test;

import com.somebank.bank.model.CheckingAccount;
import com.somebank.bank.model.BalanceNotEnoughException;

public class TestWithdrawal {

	public static void main(String[] args) {
		
		/*
		 * Testing how the exception on this code will work
		 * 
		 * this code should NOT run without getting an exception at line 20
		 */
		CheckingAccount account = new CheckingAccount(123, 321);
		
		account.deposit(200.0);
		
		try {
			account.withdrawal(210.0);
		} catch(BalanceNotEnoughException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		
		System.out.println(account.getBalance());

	}

}
