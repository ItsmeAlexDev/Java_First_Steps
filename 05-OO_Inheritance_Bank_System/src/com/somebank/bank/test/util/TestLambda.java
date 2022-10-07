package com.somebank.bank.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.somebank.bank.model.Client;
import com.somebank.bank.model.Account;
import com.somebank.bank.model.CheckingAccount;
import com.somebank.bank.model.SavingsAccount;

public class TestLambda {

	public static void main(String[] args) {
		
		/*
		 * Testing list sorting and lambdas
		 * 
		 * creating 4 accounts
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
		 * Putting the 4 accounts created before on a list
		 */
		List<Account> list = new ArrayList<>();
		list.add(ca1);
		list.add(sa2);
		list.add(ca3);
		list.add(sa4);
		
		/*
		 * I can sort a list using the interface "Comparator"
		 * 
		 * this should sort the list based on the name on the accounts
		 * in alphabetical order
		 */
		Comparator<Account> comp = (Account c1, Account c2) -> {
				String nomeC1 = c1.getOwner().getName();
				String nomeC2 = c2.getOwner().getName();
				return nomeC1.compareTo(nomeC2);
		};
		list.sort( comp );

		/*
		 * I could also turn this code a bit smaller:
		 * 
		 * list.sort((c1, c2) -> c1.getTitular().getName().compareTo(c2.getTitular().getName()));
		 */


		//also, a little addition to my "for loops" knowledge
		list.forEach( (account) -> System.out.println(account + ", " + account.getOwner().getName()));
		
		//Line to see different outputs
		System.out.println("------------------------------------------------------------");
		
		/*
		 * Sorting based on the number of the account
		 * 
		 * the Lowest number should come First
		 * and the Highest should come Last
		 */
		list.sort( (c1, c2) -> Integer.compare(c1.getNumber(), c2.getNumber()) );
		
		//also, a little addition to my "for loops" knowledge
		list.forEach( (conta) -> System.out.println(conta + ", " + conta.getOwner().getName()));
		
	}
}

