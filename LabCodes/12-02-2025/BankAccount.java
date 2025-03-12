public abstract class BankAccount {
    private int accountNumber;
    private double balance;

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
    }

}
