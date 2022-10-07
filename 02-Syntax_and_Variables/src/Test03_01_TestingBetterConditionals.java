public class Test03_01_TestingBetterConditionals {

	public static void main(String[] args) {

		int age = 18;
		int numberOfPeople = 3;

		/*
		 * To enter you must be NOT underage and NOT alone
		 */
		
		if (age >= 18 && numberOfPeople >= 2) {
			/*
			 * When one puts "&&" in a conditional, like shown above
			 * both requeriments must be met for the conditional to be considered true
			 * 
			 * similar to && for "AND", I can use || for "OR"
			 * 
			 * in this situation you can only enter if you are NOT underage AND NOT alone
			 */
			System.out.println("Welcome!");
		} else {
			System.out.println("You can NOT enter here, sorry!");
		}

	}
}