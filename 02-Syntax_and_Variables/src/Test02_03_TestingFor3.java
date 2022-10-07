public class Test02_03_TestingFor3 {
	public static void main(String[] args) {
		
		/*
		 * This Should print "*" until the value of the line is equal to the value of the column
		 */
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
