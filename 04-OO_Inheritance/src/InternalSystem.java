
public class InternalSystem {
	
	private int password = 2222;
	
	/*
	 * An important system that only certain people could access
	 * would be here, needing autentication to get in  
	 */
	public void autenticate(Autenticable aut) {
		boolean autenticationSuccess = aut.autenticate(this.password);
		if(autenticationSuccess) {
			System.out.println("You can enter the system!");
		} else {
			System.out.println("Access Denied: You can NOT enter the system!");
		}
	}

}
