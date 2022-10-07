public class TestBank {
	public static void main(String[] args) {
		
		/*
		 * Creating a client
		 * 
		 * setting:
		 * "Paulo da Silva" as the name
		 * "222.22.2222" as the SSN (Social Security Number)
		 * "Developer" as the profession
		 */
		Client paulo = new Client();
		paulo.setName("Paulo da Silva");
		paulo.setSsn("222.22.2222");
		paulo.setProfession("developer");
		
		/*
		 * Creating an account for "Paulo" to use
		 */
		Account accountPaulo = new Account(6646,969060);
		accountPaulo.deposit(100);
		
		/*
		 * Setting the Client Paulo as the owner of the accountPaulo 
		 */
		accountPaulo.setOwner(paulo);
		System.out.println(accountPaulo.getOwner().getName());
		System.out.println(accountPaulo.getOwner());

	}
}