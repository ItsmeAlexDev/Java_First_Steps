public class TestMethod {
	public static void main(String[] args) {
		
		/*
		 * Creating a new account for the tests 
		 */
		Account accountPaulo = new Account(0046,123456);
		accountPaulo.deposit(100);
		accountPaulo.deposit(50);
		System.out.println(accountPaulo.getBalance());

		/*
		 * Testing the withdrawal method 
		 */
		boolean withdrawalSuccess = accountPaulo.withdrawal(20);
		System.out.println(accountPaulo.getBalance());
		System.out.println(withdrawalSuccess);
		
		/*
		 * Creating another account to test the transfer method 
		 */
		Account accountMarcela = new Account(6644,969063);
		accountMarcela.deposit(1000);

		
		/*
		 * Testing the transfer method
		 */
		boolean transferSuccess= accountMarcela.transfer(300, accountPaulo);

		if (transferSuccess) {
			System.out.println("transfered with success");

		} else {
			System.out.println("not enough money");

		}
		System.out.println(accountMarcela.getBalance());
		System.out.println(accountPaulo.getBalance());
	}

}