public class Test07_TestingIT {

    public static void main(String[] args) {

        // From 1900.00 to 2800.00 the IT (income tax) is 7.5% e pode deduce 142
        // From 2800.01 to 3751.00 the IT (income tax) is 15% e pode deduce 350
        // From 3751.01 to 4664.00 the IT (income tax) is 22.5% and you can deduce 636

        double wage = 3000.0;

        if(wage >= 1900.00 && wage <= 2800.00) { // 1899.99 < wage < 2800.00
            System.out.println("Your aliquot is 7.5%");
            System.out.println("You can deduce up to 142");
        } else if(wage >= 2800.01 && wage <= 3751.00) { // 2800.01 < wage < 3751.00
            System.out.println("Your aliquot is 15%");
            System.out.println("You can deduce up to 350");
        } else if(wage >= 3751.01 && wage <= 4664.00) { // 3751.01 < wage < 4664.00
            System.out.println("Your aliquot is 22.5%");
            System.out.println("You can deduce up to 636");
        }
    }
}