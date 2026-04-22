import java.util.Scanner;

class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public void openAccount(String accNo, String name, double initialBalance) {
        this.accountNumber = accNo;
        this.accountHolderName = name;
        this.balance = initialBalance;
        System.out.println("Account opened for " + accountHolderName + " with A/C No: " + accountNumber);
    }
  
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void checkBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}

class SavingAccount extends BankAccount {
    private double interestRate; 

    public SavingAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calculateInterest(int months) {
        double timeInYears = months / 12.0;
        return balance * interestRate * timeInYears / 100;
    }

    public void displayInterest(int months) {
        double interest = calculateInterest(months);
        System.out.printf("Interest for %d months at %.2f%% = %.2f\n", months, interestRate, interest);
        System.out.printf("Balance after adding interest: %.2f\n", balance + interest);
    }
}

class FixedDepositAccount extends BankAccount {
    private int termMonths;     
    private double fdRate;     

    public FixedDepositAccount(int termMonths, double fdRate) {
        this.termMonths = termMonths;
        this.fdRate = fdRate;
    }

    public double maturityAmount() {
        double timeInYears = termMonths / 12.0;
        double interest = balance * fdRate * timeInYears / 100;
        return balance + interest;
    }

    public void displayMaturity() {
        System.out.println("Fixed Deposit Details:");
        System.out.println("Principal Amount: " + balance);
        System.out.println("Term: " + termMonths + " months");
        System.out.println("FD Rate: " + fdRate + "%");
        System.out.printf("Maturity Amount: %.2f\n", maturityAmount());
    }
}

public class BankDemo {
    public static void main(String[] args) {
        System.out.println("=== Saving Account Demo ===");
        SavingAccount sa = new SavingAccount(4.0); 
        sa.openAccount("SA1001", "Riya Patel", 50000);
        sa.deposit(10000);
        sa.withdraw(5000);
        sa.checkBalance();
        sa.displayInterest(6); 

        System.out.println("\n=== Fixed Deposit Account Demo ===");
        FixedDepositAccount fd = new FixedDepositAccount(12, 6.5); 
        fd.openAccount("FD2001", "Amit Shah", 100000);
        fd.checkBalance();
        fd.displayMaturity();
    }
}
