
public class UtilAutentication {
	
	private int password;
	
	/*
	 * Set the password to be used
	 */
	public void setPassword(int password) {
		this.password = password;	
	}

	/*
	 * Autenticate the password inputed 
	 */
	public boolean autenticate(int password) {
		if(this.password == password) {
			return true;
		} else {
			return false;
		}
	}

}
