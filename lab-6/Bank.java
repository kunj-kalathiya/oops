class Bank {

    // Deposit method
    double deposit(double amount, double balance) {
        double newBalance = balance + amount;
        return newBalance;
    }
    // Withdraw method
    double withdraw(double amount, double balance) {
        if (balance >= amount) {
            return balance - amount;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Bank b = new Bank();

        double balance = 1000;

        // Deposit
        balance = b.deposit(500, balance);
        System.out.println("Balance after deposit: " + balance);

        // Withdraw
        balance = b.withdraw(300, balance);
        System.out.println("Balance after withdrawal: " + balance);

        // Withdraw more than balance
        balance = b.withdraw(1500, balance);
        System.out.println("Balance after excessive withdrawal: " + balance);
    }
}
