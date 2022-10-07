package com.sample.banksys;

import com.somebank.bank.model.Account;
import com.somebank.bank.model.CheckingAccount;

public class TestLibrary {

	public static void main(String[] args) {

		/*
		 * Here is a test of a library made using the last project
		 * 
		 * I can use the Classes and Methods,
		 * so the library is working as it should
		 */
		Account ca = new CheckingAccount(123, 123);
		
		ca.deposit(100.00);
		
		System.out.println(ca.getBalance());
	}

}
