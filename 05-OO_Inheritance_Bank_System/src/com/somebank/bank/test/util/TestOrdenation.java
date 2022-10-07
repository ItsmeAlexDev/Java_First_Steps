package com.somebank.bank.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.somebank.bank.model.Client;
import com.somebank.bank.model.Account;
import com.somebank.bank.model.CheckingAccount;
import com.somebank.bank.model.SavingsAccount;

public class TestOrdenation {

	public static void main(String[] args) {

		/*
		 * Testing some ways to sort a list
		 * 
		 * Creating 4 accounts
		 */
		Account ca1 = new CheckingAccount(22, 33);
		Client clientCA1 = new Client();
		clientCA1.setName("Nico");
		ca1.setOwner(clientCA1);
		ca1.deposit(333.0);

		Account sa2 = new SavingsAccount(22, 44);
		Client clientSA2 = new Client();
		clientSA2.setName("Guilherme");
		sa2.setOwner(clientSA2);
		sa2.deposit(444.0);

		Account ca3 = new CheckingAccount(22, 11);
		Client clientCA3 = new Client();
		clientCA3.setName("Paulo");
		ca3.setOwner(clientCA3);
		ca3.deposit(111.0);

		Account sa4 = new SavingsAccount(22, 22);
		Client clientSA4 = new Client();
		clientSA4.setName("Ana");
		sa4.setOwner(clientSA4);
		sa4.deposit(222.0);

		/*
		 * Putting the 4 accounts in a list
		 */
		List<Account> list = new ArrayList<>();
		list.add(ca1);
		list.add(sa2);
		list.add(ca3);
		list.add(sa4);

		/*
		 * Printing out the list
		 */
		for (Account account : list) {
			System.out.println(account);
		}

		// I can created my own comparator using a class
		AccountNumberComparator numComparator = new AccountNumberComparator();
		AccountOwnerComparator nameComparator = new AccountOwnerComparator();

		System.out.println("---------");
		list.sort(numComparator);
		for (Account account : list) {
			System.out.println(account);
		}

		System.out.println("---------");
		list.sort(nameComparator);
		for (Account account : list) {
			System.out.println(account);
		}

		/*
		 * There is also the methods in the class "Collections" 
		 * 
		 * such as
		 * 1-Collections.sort(list, new Comparator());
		 * 2-Collections.sort(list);
		 * 3-Collections.reverse(list);
		 *
		 * 1 would sort the list based on the comparator
		 * 2 would sort the list based on a "natural order"
		 * 3 would revert the list
		 */
		
		
		
	}
}

/*
 * Creating my own comparators
 * 
 * here I have one that sorts based on the name of the titular of the account
 */
class AccountOwnerComparator implements Comparator<Account> {

	@Override
	public int compare(Account c1, Account c2) {
		String nomeC1 = c1.getOwner().getName();
		String nomeC2 = c2.getOwner().getName();
		return nomeC1.compareTo(nomeC2);
	}
}

/*
 * here I have one that sorts based on the number of the account
 */
class AccountNumberComparator implements Comparator<Account> {

	@Override
	public int compare(Account c1, Account c2) {
		return Integer.compare(c1.getNumber(), c2.getNumber());

		// another way of doing the line above (117)
//		return c1.getNumber() - c2.getNumber();

		// another way of doing the line above (118)
		// this is way is kinda bad when looking at all the options
//		if(c1.getNumber() < c2.getNumber()) {
//			return -1;
//		}
//		if(c1.getNumber() > c2.getNumber()) {
//			return 1;
//		}
//		return 0;
	}
}
