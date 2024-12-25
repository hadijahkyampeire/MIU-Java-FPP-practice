package innerClasses;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Member inner class
    public class Transaction {
        // Complete this method to deposit money into the balance
        public void deposit(double amount) {
            balance = balance + amount;
        }

        // Complete this method to withdraw money from the balance
        public void withdraw(double amount) {
            balance = balance - amount;
        }

        // Complete this method to get the current balance
        public double getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        BankAccount.Transaction transaction = account.new Transaction();

        transaction.deposit(500); // Add 500 to the balance
        System.out.println("Balance after deposit: " + transaction.getBalance()); // Should print 1500

        transaction.withdraw(200); // Subtract 200 from the balance
        System.out.println("Balance after withdrawal: " + transaction.getBalance()); // Should print 1300
    }
}

