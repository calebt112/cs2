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

        // Die class method calls
        // create a new die object
        Die die = new Die();
        // create a new die with 12 sides
        Die die2 = new Die(12);
        // display die
        System.out.println(die);
        System.out.println(die2);
        // roll die
        die.roll();
        die2.roll();
        // display die
        System.out.println(die);
        System.out.println(die2);
    }
}
