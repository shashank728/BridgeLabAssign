// Q9. Default values of instance variables
class Account {
    String accountHolder;
    double balance;

    public static void main(String[] args) {
        Account a = new Account();
        System.out.println("Account Holder: " + a.accountHolder); // null
        System.out.println("Balance: " + a.balance); // 0.0
    }
}
