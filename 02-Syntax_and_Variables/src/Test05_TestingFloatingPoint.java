public class Test05_TestingFloatingPoint{

    public static void main(String[] args){
    	
    	/*
		 * Testing how to make a number with some decimals (pi)
		 */
    	int pi = 3;
    	System.out.println("The (approx.) value of pi (as an int) is : " + pi);
    	double pi2 = 3.1415;
    	System.out.println("The (approx.) value of pi (as a double) is : " + pi2);
        float pi3 = 3.14159265f;
        System.out.println("The (approx.) value of pi (as a float) is : " + pi3);
        
    	/*
		 * Printing a value with decimals
		 */
        double minWage = 1212.00;
        System.out.println("The minimun wage is: " + minWage);
        
        /*
		 * Printing a division with actual decimals, the result should be 2.5
		 */
        double division = 5.0 / 2;
        System.out.println("division: " + division);

    }
}