public class CreateAccount {

    public static void main(String[] args) {
    	
    	/*
    	 * Creating an account using the constructing
    	 * setting 0066 as the agency
    	 * setting 123456 as the number of the account
    	 * 
    	 * after that depositing 200
    	 */
        Account firstAccount = new Account(0066,123456);
        firstAccount.deposit(200);
        System.out.println(firstAccount.getBalance());

        /*
         * Depositing more money to see if the method "deposit" works 
         */
        firstAccount.deposit(100);
        System.out.println(firstAccount.getBalance());

        /*
         * Creating another account 
         */
        Account secondAccount = new Account(0045,654321);
        secondAccount.deposit(50);

        /*
         * Seeing the balance of both accounts created before
         */
        System.out.println("The first account got a balance of: " + firstAccount.getBalance());
        System.out.println("The seconde account got a balance of: " + secondAccount.getBalance());

        
        /*
         * Seeing the account (the reference of the account) as a string 
         */
        System.out.println("(Account) reference: " + firstAccount.toString());
    }

}