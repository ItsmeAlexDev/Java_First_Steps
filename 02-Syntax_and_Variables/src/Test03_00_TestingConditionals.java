public class Test03_00_TestingConditionals {

	public static void main(String[] args) {

		int age = 18;
		int numberOfPeople = 2;
		
		/*
		 * People who are NOT underage can enter with no problem
		 * People who ARE underage can only enter if they are NOT alone
		 */

		if (age >= 18) {

			System.out.println("You are NOT underage, you can enter!");
			System.out.println("Welcome!");
		} else {

			if (numberOfPeople >= 2) {
				System.out.println("You ARE underage, but you can enter, because you have someone with you");
			} else {

				System.out.println("You can NOT enter, as you are underage and you are alone");
			}

		}
	}
}