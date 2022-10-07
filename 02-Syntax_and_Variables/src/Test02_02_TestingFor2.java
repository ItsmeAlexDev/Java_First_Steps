public class Test02_02_TestingFor2 {

        public static void main(String[] args){
        	
        /*
   		 * This should print a table with the multiplyING values of 1-10
   		 * and the multipliER values of 1-10
   		 */
            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                for(int counter = 0; counter <= 10; counter++) {
                    System.out.print(multiplier * counter);
                    System.out.print(" ");
                }
                System.out.println();
            }

    }
}