public class activityDriver {
    public static void main(String[] args) {

        // Account class method calls
        // create a new account object
        Account account = new Account(1122, "Caleb");
        // deposit $20,000
        account.deposit(20000);
        // withdraw $2,500
        account.withdraw(2500);
        // display account
        System.out.println(account);

        // Sandwich class method calls
        // create a new sandwich object
        Sandwich sandwich = new Sandwich("Turkey", 245, 4.99);
        // check isHealthy
        System.out.println(sandwich.isHealthy());
        // display sandwich
        System.out.println(sandwich);
    }
}
