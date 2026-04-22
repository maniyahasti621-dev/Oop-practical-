class BankAccount {
    private String account_holder_name;
    private double balance;

    private static double interest_rate = 5.0;
  
    public BankAccount(String account_holder_name, double balance) {
        this.account_holder_name = account_holder_name;
        this.balance = balance;
    }

    public double calculateInterest() {
        return balance * interest_rate / 100;
    }

    public void displayInterest() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Current Balance: " + balance);
        System.out.println("Interest Rate: " + interest_rate + "%");
        System.out.printf("Interest Earned: %.2f\n", calculateInterest());
    }

    public static void updateInterestRate(double newRate) {
        interest_rate = newRate;
        System.out.println("Interest rate updated to " + interest_rate + "% for all accounts");
    }

    public double getBalance() {
        return balance;
    }

    public void addInterest() {
        balance += calculateInterest();
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Rahul Mehta", 10000);
        BankAccount acc2 = new BankAccount("Priya Shah", 25000);

        System.out.println("=== Interest with default rate ===");
        acc1.displayInterest();
        System.out.println();
        acc2.displayInterest();

        System.out.println("\n=== Updating interest rate ===");
        BankAccount.updateInterestRate(6.5);

        System.out.println("\n=== Interest after rate update ===");
        acc1.displayInterest();
        System.out.println();
        acc2.displayInterest();

        System.out.println("\n=== Adding interest to balance ===");
        acc1.addInterest();
        System.out.println("New balance for " + "Rahul Mehta: " + acc1.getBalance());
    }
}
