public class Test04_TestingConversion{

    public static void main(String[] args){
    	
        /*
		 *  Converting a double (with decimals), to an int
		 */
        double wage = 1270.50;
        int value = (int) wage; //conversion made using "Casting"
        System.out.println(value);
        /*
		 * The value of the wage after the conversion is the same but without the decimals
		 * so, an int can NOT have decimals, I must remember this fact while converting to int(s)
		 */
        
        
        /*
		 * A rather interesting fact is that when you use a computer to add
		 * 0.2 and 0.1 the result is 0.30000000000000004 and not the expected 0.3
		 */
        double value1 = 0.2;
        double value2 = 0.1;
        double total = value1 + value2;
        System.out.println(total);
    }
}