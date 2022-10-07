
public class Client implements Autenticable {

	/*
	 * Creating a "Client" class to simulate a class
	 * that would be used by a client
	 */
	private UtilAutentication autenticator;
	
	public Client() {
		this.autenticator = new UtilAutentication();
	}
	
	
	@Override
	public void setPassword(int password) {
		this.autenticator.setPassword(password);
	}

	@Override
	public boolean autenticate(int password) {
		return this.autenticator.autenticate(password);
	}
	
}
