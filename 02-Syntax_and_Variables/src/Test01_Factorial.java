public class Test01_Factorial {
	public static void main(String[] args) {

		/*
		 * Setting a test with the factorial of 4;
		 */
		System.out.println("The factorial of 4 is: " + factorial(4));

		/*
		 * Getting the factorials of 1 to 10
		 */
		System.out.println("Factorial of 1 to 10:");
		for (int i = 0; i <= 10; i++) {
			System.out.println("The Factorial of " + i + " is: " + factorial(i));
		}

	}

	private static int factorial(int num) {

		/*
		 * return 1 when the num is 0, because 0! = 1
		 */
		if (num <= 1)
			return 1;

		/*
		 * multiplying num with (num - 1)!, because num! = num * (num-1)!
		 * until, num - 1 = 0 (when this happens the code will return 1) obtaining the factorial of num
		 */
		return num * factorial(num - 1);

	}
}