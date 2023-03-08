public class activityDriver {
    public static void main(String[] args) {

        // create a new account object
        Account account = new Account(1122, "Caleb");
        // deposit $20,000
        account.deposit(20000);
        // withdraw $2,500
        account.withdraw(2500);
        // display account
        System.out.println(account);
    }
}
