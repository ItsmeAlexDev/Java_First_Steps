package com.somebank.bank.model;


/**
 * Class that represents the "shape" of an account
 * 
 * @author AlexDev
 *
 */
public abstract class Account extends Object implements Comparable<Account>{

    protected double balance;
    private int agency;
    private int number;
    private Client owner;
    private static int total = 0;
    
    /**
     * Constructor to inicialize the object "Account" from the agency and number.
     * 
     * @param agency
     * @param number
     */
    public Account(int agency, int number){
        Account.total++;
        this.agency = agency;
        this.number = number;
    }
    
    /**
     * Method to deposit funds into an account
     * 
     * @param value
     * 
     */
    public abstract void deposit(double value);

    /**
     * Method to withdrawal funds from an account. Value needs to be less than the balance of the account
     * 
     * @param value
     * @throws BalanceNotEnoughException
     */
    public void withdrawal(double value) throws BalanceNotEnoughException{
    	
        if(this.balance < value) {
            throw new BalanceNotEnoughException("Balance: " + this.balance + ", Value: " + value);
        } 
        
        this.balance -= value;       
    }

    public void transfer(double value, Account destination) throws BalanceNotEnoughException{
        this.withdrawal(value);
        destination.deposit(value);
    }

    public double getBalance(){
        return this.balance;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        if(number <= 0) {
            System.out.println("You can NOT input a value less or equal than 0");
            return;
        }
        this.number = number;
    }

    public int getAgency(){
        return this.agency;
    }

    public void setAgency(int agency){
       if(agency <= 0) {
           System.out.println("You can NOT input a value less or equal than 0");
           return;
       }
       this.agency = agency;
    }

    public void setOwner(Client owner){
        this.owner = owner;
    }

    public Client getOwner(){
        return this.owner;
    }

    public static int getTotal(){
        return Account.total;
    }  
    
    @Override
    public boolean equals(Object ref) {
    	
    		Account another = (Account) ref;
    		
    		if(this.agency != another.agency) {
    			return false;
    		}
    		
    		if(this.number != another.number) {
    			return false;
    		}
    		
    		return true;
    }
    
    @Override
    public int compareTo(Account another) {
    		return Double.compare(this.balance, another.balance);
    }
    
    @Override
	public String toString() {
		return "Number: " + this.number + ", Agency: " + this.agency + ", Balance: " + this.balance;
	}

}