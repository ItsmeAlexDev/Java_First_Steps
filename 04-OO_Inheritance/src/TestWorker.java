
public class TestWorker {

	public static void main(String[] args) {
		
		/*
		 * Testing a worker of this made up company,
		 * this worker has the role "Gerente" 
		 */
		Manager nico = new Manager();
		nico.setName("Nico Steppat");//Actual real name of an instructor on Alura ( https://www.Alura.com.br )
		nico.setSsn("222.33.4444");
		nico.setWage(2600.00);

		System.out.println(nico.getName());
		System.out.println(nico.getSsn());
		System.out.println(nico.getWage());
		System.out.println(nico.getBonus());
		
	}

}
