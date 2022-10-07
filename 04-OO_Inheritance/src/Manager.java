
public class Manager extends Worker implements Autenticable{
	
	private UtilAutentication autenticator;

	/*
	 * Implements "Autenticavel" because 
	 * this is an important role on the company
	 */
	public Manager() {
		this.autenticator = new UtilAutentication();
	}
	
	/*
	 * The getBonus method here returns the wage
	 * and not a fixed value, because the bonus is 100% of the wage 
	 * other roles of the company get fewer** bonus than this role
	 * 
	 * **(there is some cases where 
	 * this would not be true, but those cases do not matter)  
	 */
	public double getBonus() {
		return super.getWage();
	}

	//Methods of the "important" roles
	@Override
	public void setPassword(int password) {
		this.autenticator.setPassword(password);
	}

	@Override
	public boolean autenticate(int password) {
		return this.autenticator.autenticate(password);
	}

	

}
