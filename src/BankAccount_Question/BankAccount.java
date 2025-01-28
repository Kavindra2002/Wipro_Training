package BankAccount_Question;

public class BankAccount {
    // Attributes
    private String accountHolderName;
    private int balance;

    // Constructor
    public BankAccount(String accountHolderName, int initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than 0.");
        }
    }

    // Method to withdraw money
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("John Doe", 1000);

        // Test deposit, withdraw, and check balance methods
        account.checkBalance(); // Initial balance
        account.deposit(500);   // Deposit 500
        account.checkBalance(); // Balance after deposit
        account.withdraw(200);  // Withdraw 200
        account.checkBalance(); // Balance after withdrawal
        account.withdraw(2000); // Attempt to withdraw more than balance
        account.checkBalance(); // Balance remains unchanged
    }
}
