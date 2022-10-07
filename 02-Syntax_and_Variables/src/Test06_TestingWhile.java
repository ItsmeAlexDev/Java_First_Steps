public class Test06_TestingWhile {

	public static void main(String[] args) {
		
		/*
		 * Could use this instead of a "for", but I can think of some better uses for this 
		 * such as some section of code that keeps repeating until the result is a valid one
		 */
		
		int counter = 0;
		while (counter <= 10) {
			System.out.println(counter);
			counter++;
		}
	}
}