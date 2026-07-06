 Encapsulation
// Encapsulation Example: Bank Account
public class BankAccount {
    // Private fields (data hiding)
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Set to 0.");
        }
    }

    // Public getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Public getter for balance (read-only)
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 5000);

        // Accessing data via public methods
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(1500);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(2000);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Trying invalid operations
        account.deposit(-500);
        account.withdraw(10000);
    }
}