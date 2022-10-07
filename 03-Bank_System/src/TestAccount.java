public class TestAccount {
	public static void main(String[] args) {
		
		/*
		 * Creating an account and getting the balance 
		 * (balance should be 100 as this is the default starting value)
		 */
		Account accountMarcela = new Account(0046,1234456);
		System.out.println("Balance: " + accountMarcela.getBalance());

		/*
		 * Creating a owner to put in the account 
		 */
		accountMarcela.setOwner(new Client());
		System.out.println("Owner: " + accountMarcela.getOwner());

		/*
		 * Setting a name to the owner created above
		 */
		accountMarcela.getOwner().setName("Marcela");
		System.out.println("Owner -> Name: " + accountMarcela.getOwner().getName());

	}
}