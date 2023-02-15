public class Driver {
    public static void main(String[] args) {

        /**
        * Die Driver
        * Calls the Die class to create a die with n sides and rolls it 10 times
         */
//        Die dieA = new Die(1);
//        System.out.println(dieA);
//        dieA.roll();
//        System.out.println(dieA);
//        Die dieB = new Die();
//        System.out.println(dieB);
//        for(int i = 0; i < 10; i++) {
//            dieB.roll();
//            System.out.println(dieB);
//        }

        /**
         * Account Driver
         * Calls the Account class to create an account with a number and owner
         * and then deposits and withdraws money
         */

//        Account accountA = new Account(1234, "Thompson");
//        System.out.println(accountA);
//        accountA.deposit(100);
//        System.out.println(accountA);
//        accountA.withdraw(50);
//        System.out.println(accountA);

        /**
         * Sandwich Driver
         * Calls the Sandwich class to create a sandwich with a name, price, and calories
         * and then checks if it is healthy
         */

        Sandwich sandwichA = new Sandwich("BLT", 5.99, 249);
        System.out.println(sandwichA);
        System.out.println(sandwichA.isHealthy());
        Sandwich sandwichB = new Sandwich("PB&J", 3.99, 300);
        System.out.println(sandwichB);
        System.out.println(sandwichB.isHealthy());
    }
}
