add check deposite_limit & check withdraw_limit  (in bacnkactivite program)
maintain minimum balance after withdrawing if balance is not sufficient than send suitable msg.

=>public class BankActivity {
    private double balance;
    private double depositLimit;
    private double withdrawLimit;
    private double minimumBalance;

    // Constructor
    public BankActivity(double initialBalance, double depositLimit, double withdrawLimit, double minimumBalance) {
        this.balance = initialBalance;
        this.depositLimit = depositLimit;
        this.withdrawLimit = withdrawLimit;
        this.minimumBalance = minimumBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > depositLimit) {
            System.out.println("Deposit amount exceeds the deposit limit of " + depositLimit);
        } else {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New Balance: " + balance);
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > withdrawLimit) {
            System.out.println("Withdrawal amount exceeds the withdrawal limit of " + withdrawLimit);
        } else if (balance - amount < minimumBalance) {
            System.out.println("Insufficient balance! Maintaining a minimum balance of " + minimumBalance + " is required.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Create a BankActivity object with initial balance, deposit limit, withdraw limit, and minimum balance
        BankActivity account = new BankActivity(1000.0, 5000.0, 1000.0, 200.0);

        // Test depositing money
        account.deposit(3000.0);  // Within deposit limit
        account.deposit(6000.0);  // Exceeds deposit limit

        // Test withdrawing money
        account.withdraw(500.0);  // Within withdraw limit and maintaining minimum balance
        account.withdraw(1500.0); // Exceeds withdraw limit
        account.withdraw(1500.0); // Within limit but not maintaining minimum balance
    }
}
