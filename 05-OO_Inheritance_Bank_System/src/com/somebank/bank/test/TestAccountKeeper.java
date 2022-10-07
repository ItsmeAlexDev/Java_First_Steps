package com.somebank.bank.test;

import com.somebank.bank.model.Account;
import com.somebank.bank.model.CheckingAccount;
import com.somebank.bank.model.AccountKeeper;

public class TestAccountKeeper {

	public static void main(String[] args) {
		
		/*
		 * Testing the "AccountKeeper" Class
		 * and how it works
		 */
		AccountKeeper AKeeper = new AccountKeeper();
		
		Account ca = new CheckingAccount(22, 11);
		AKeeper.add(ca);

		Account ca2 = new CheckingAccount(22, 22);
		AKeeper.add(ca2);
		
		int size = AKeeper.getNumberOfElements();
		System.out.println(size);
		
		/*
		 *  Testing multiple references of a single Object
		 *  
		 *  the getReference method got 1 as the input and yet returns the 2nd element of the list
		 *  this is due to the fact that java and many other languages start counting on 0
		 *  so the 1st element would be on 0, 2nd on 1, 3rd on 2...
		 *  
		 *  the nth element is on the position n - 1 
		 */
		Account ref = AKeeper.getReference(1);
		System.out.println(ref.getNumber());
		System.out.println(ca2.getNumber());
		
	}

}
