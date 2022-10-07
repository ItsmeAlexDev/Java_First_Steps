public class TestWithdrawalNegative {
	public static void main(String[] args) {
		
		/*
		 * Testing the withdrawal of too much money
		 */
		Account conta = new Account(0046,123456);
		conta.deposit(100);
		System.out.println(conta.withdrawal(101));
		
		/*
		 * This section should not work as you can't withdrawal 200 from 99
		 */
		System.out.println(conta.withdrawal(200));

		System.out.println(conta.getBalance());

	}
}