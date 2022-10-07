package com.somebank.bank.test;

import com.somebank.bank.model.TaxCalculator;
import com.somebank.bank.model.CheckingAccount;
import com.somebank.bank.model.LifeInsurance;

//classe Teste
public class TestTaxable {

	public static void main(String[] args) {
		
		/*
		 * Testing the uses of interfaces
		 * 
		 * the interface on this is "Taxable"
		 * and here it's notable how I can use this
		 * as a way to get specific things that 
		 * different classes have in common such as
		 * taxes, important numbers, etc.
		 */
		CheckingAccount ca= new CheckingAccount(222, 333);
		ca.deposit(100.0); //tax on this is 1% (in this case 1.0)
		
		LifeInsurance insurance = new LifeInsurance(); //tax on this is 42.0
		
		TaxCalculator calc = new TaxCalculator();
		calc.register(ca);//1.0
		calc.register(insurance);//42.0
		
		System.out.println(calc.getTotalTax()); //this should be 43.0

	}

}
