Abstract Class in Java
import java.util.Scanner;

// Abstract Class
abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void displayBalance() {
        System.out.println("Account: " + accountNumber + " | Current Balance: $" + balance);
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}

// Savings Account
class SavingsAccount extends BankAccount {
    private static final double MINIMUM_BALANCE = 100.00;

    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " to Savings Account.");
    }

    @Override
    public void withdraw(double amount) {
        if ((balance - amount) >= MINIMUM_BALANCE) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Savings Account.");
        } else {
            System.out.println("Transaction Denied: Savings accounts must maintain a $" + MINIMUM_BALANCE + " minimum balance.");
        }
    }
}

// Current Account
class CurrentAccount extends BankAccount {
    private double overdraftLimit = 500.00;

    public CurrentAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " to Current Account.");
    }

    @Override
    public void withdraw(double amount) {
        if ((balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Current Account.");
        } else {
            System.out.println("Transaction Denied: Overdraft limit exceeded.");
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Type (1-Savings, 2-Current): ");
        int type = sc.nextInt();

        System.out.print("Enter Account Number: ");
        String accountNumber = sc.next();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount account;

        if (type == 1) {
            account = new SavingsAccount(accountNumber, initialBalance);
        } else {
            account = new CurrentAccount(accountNumber, initialBalance);
        }

        System.out.print("Enter Deposit Amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter Withdraw Amount: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("\nFinal Account Details");
        account.displayBalance();

        sc.close();
    }
}