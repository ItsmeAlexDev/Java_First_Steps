
public class TestSystem {

	public static void main(String[] args) {
		
		/*
		 * Testing the Internal System Access control 
		 */
		Manager g = new Manager();
		g.setPassword(2222);//should be able to enter
		
		Admin adm = new Admin();
		adm.setPassword(3333);//should NOT be able to enter
		
		Client client = new Client();
		client.setPassword(2222);//should be able to enter
		
		InternalSystem si = new InternalSystem();
		si.autenticate(g);
		si.autenticate(adm);
		si.autenticate(client);


	}

}
