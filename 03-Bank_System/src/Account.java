public class Account {
	
	/*
	 * Setting as attributes some things that every bank account have
	 */
	private double balance;
	private int agency;
	private int number;
	private Client owner;
	private static int total = 0;

	/*
	 * Constructor - Instantiate a new account when called
	 * example: Account account = new Account(x, y); 
	 */
	public Account(int agency, int number) {
		Account.total++;
		System.out.println("The total of accounts is: " + Account.total);
		this.agency = agency;
		this.number = number;
		this.balance = 100;
		System.out.println("I am creating an account, number: " + this.number);
	}
	
	/*
	 * Deposits a certain value in an account 
	 */
	public void deposit(double value) {
		this.balance = this.balance + value;
	}

	/*
	 * Removes money from an account and
	 * returns a confirmation if the operation was sucessful
	 */
	public boolean withdrawal(double value) {
		if (this.balance >= value) {
			this.balance -= value;
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Transfers money from one account to another and
	 * returns a confirmation if the operation was succesful
	 */
	public boolean transfer(double value, Account destination) {
		if (this.balance >= value) {
			this.balance -= value;
			destination.deposit(value);
			return true;
		}
		return false;
	}

	/*
	 * Returns the balance of the account
	 */
	public double getBalance() {
		return this.balance;
	}

	/*
	 * Returns the number of the account
	 */
	public int getNumber() {
		return this.number;
	}

	/*
	 * Sets a new number to be the number of the account
	 */
	public void setNumber(int number) {
		if (number <= 0) {
			System.out.println("You can NOT input a value fewer or equal to 0");
			return;
		}
		this.number = number;
	}

	/*
	 * Returns the agency of the account
	 */
	public int getAgency() {
		return this.agency;
	}

	/*
	 * Sets a new number to be the agency of the account
	 */
	public void setAgency(int agency) {
		if (agency <= 0) {
			System.out.println("You can NOT input a value fewer or equal to 0");
			return;
		}
		this.agency = agency;
	}
	
	/*
	 * Sets a new Client as the owner of the account 
	 */
	public void setOwner(Client owner) {
		this.owner = owner;
	}
	
	/*
	 * Returns the owner of the account 
	 */
	public Client getOwner() {
		return this.owner;
	}

	/*
	 * Returns the total number of accounts in the system
	 */
	public static int getTotal() {
		return Account.total;
	}

}