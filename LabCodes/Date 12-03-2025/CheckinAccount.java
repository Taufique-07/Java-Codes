public class CheckinAccount extends BankAccount{

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }
}

class Main {
    public static void main(String[] args) {
        CheckinAccount account = new CheckinAccount();
        account.setAccountNumber(1234);
        account.setBalance(50000);
        account.deposit(5000);
        account.display();
        account.withdraw(5000);
        System.out.println(account.getBalance());
        account.display();
    }
}
