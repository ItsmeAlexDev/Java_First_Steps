
public class Admin extends Worker implements Autenticable{
	
	/*
	 * Creating a way to verify the identity of whoever is entering in the account,
	 * this is need because someone with access to an admin account would be able to
	 * get some "secret" info of a company
	 */
	private UtilAutentication autenticator;

	public Admin() {
		this.autenticator = new UtilAutentication();
	}
	
	/*
	 * Get the bonus that this admin could get
	 */
	@Override
	public double getBonus() {
		return 50;
	}
	
	/*
	 * Set the password that you need to access this account
	 */
	@Override
	public void setPassword(int password) {
		this.autenticator.setPassword(password);
	}

	/*
	 * Check the password that someone trying to enter the account inputs
	 */
	@Override
	public boolean autenticate(int password) {
		return this.autenticator.autenticate(password);
	}

}
