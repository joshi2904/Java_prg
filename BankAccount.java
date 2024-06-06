public class BankAccount {
    private static int objectCount = 0; // Static variable to count objects

    private double balance;
    private double depositLimit;
    private double withdrawLimit;
    private double minimumBalance;

    // Constructor
    public BankAccount(double initialBalance, double depositLimit, double withdrawLimit, double minimumBalance) {
        if (initialBalance < minimumBalance) {
            throw new IllegalArgumentException("Initial balance cannot be less than the minimum balance.");
        }
        this.balance = initialBalance;
        this.depositLimit = depositLimit;
        this.withdrawLimit = withdrawLimit;
        this.minimumBalance = minimumBalance;
        objectCount++;
    }

    // Static method to get the current count of objects
    public static int getObjectCount() {
        return objectCount;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > depositLimit) {
            System.out.println("Deposit amount exceeds the deposit limit.");
        } else {
            balance += amount;
            System.out.println("Deposited: " + amount + ", Current Balance: " + balance);
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > withdrawLimit) {
            System.out.println("Withdrawal amount exceeds the withdrawal limit.");
        } else if (balance - amount < minimumBalance) {
            System.out.println("Insufficient balance to maintain the minimum balance after withdrawal.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Current Balance: " + balance);
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Create a bank account with initial balance, deposit limit, withdrawal limit, and minimum balance
        BankAccount account = new BankAccount(1000, 5000, 1000, 200);

        // Deposit money
        account.deposit(2000); // Success
        account.deposit(6000); // Exceeds deposit limit

        // Withdraw money
        account.withdraw(500); // Success
        account.withdraw(1500); // Exceeds withdrawal limit
        account.withdraw(800); // Insufficient balance to maintain minimum balance

        // Display the number of accounts created
        System.out.println("Number of accounts created: " + BankAccount.getObjectCount());
    }
}
