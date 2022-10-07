
public class TestManager {

	public static void main(String[] args) {
		
		/*
		 * Testing a "Manager" and its methods 
		 */
		Manager g1 = new Manager();
		g1.setName("Marco");
		g1.setSsn("222.33.4444");
		g1.setWage(5000.0);
		g1.setPassword(2222);
		
		System.out.println(g1.getName());
		System.out.println(g1.getSsn());
		System.out.println(g1.getWage());
		System.out.println(g1.getBonus());
		
		boolean autenticationSuccess = g1.autenticate(2222);
		if (autenticationSuccess) System.out.println("identidy verified");
		
	}

}
