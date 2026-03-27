/**
 * Base class representing a general bank account.
 */
class Account {
    protected int accountNumber;
    protected double balance;

    /**
     * Constructor to initialize account number and balance.
     * @param accountNumber The unique account number
     * @param balance Initial balance of the account
     */
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Method to calculate interest.
     * This method is meant to be overridden in subclasses.
     * @return interest amount
     */
    public double calculateInterest() {
        return 0; // default implementation
    }
}

/**
 * Saving account class
 */
class SavingAccount extends Account {
    private double interestRate = 0.04; // 4% interest

    public SavingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Calculates interest for saving account.
     * @return interest amount
     */
    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}

/**
 * Current account class
 */
class CurrentAccount extends Account {
    private double interestRate = 0.01; // 1% interest

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Calculates interest for current account.
     * @return interest amount
     */
    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}

/**
 * Fixed deposit account class
 */
class FixedDepositAccount extends Account {
    private double interestRate = 0.07; // 7% interest

    public FixedDepositAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Calculates interest for fixed deposit account.
     * @return interest amount
     */
    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}

/**
 * Main class to demonstrate polymorphism
 */
public class BankDemo {
    public static void main(String[] args) {

        // Polymorphism: Account reference points to different account types
        Account acc1 = new SavingAccount(101, 1000);
        Account acc2 = new CurrentAccount(102, 2000);
        Account acc3 = new FixedDepositAccount(103, 5000);

        System.out.println("Saving Account Interest: " + acc1.calculateInterest());
        System.out.println("Current Account Interest: " + acc2.calculateInterest());
        System.out.println("Fixed Deposit Interest: " + acc3.calculateInterest());
    }
}
