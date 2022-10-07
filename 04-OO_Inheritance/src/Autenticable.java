
public abstract interface Autenticable {
	
	//Requires to define a method of "setPassword", 
	public abstract void setPassword(int password) ;
	
	//Requires to define a method of "autenticate"
	public abstract boolean autenticate(int password) ;
}
