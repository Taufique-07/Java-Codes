import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class Bank$ {
    double balance;


    public void withdraw (double amount) {
        try {
            if (amount > balance) {
                throw new InsufficientBalanceException("Balance Not Available");
            } else {
                this.balance = balance - amount;
            }
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

    }
}

public class LastExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();

        Bank$ obj = new Bank$();
        obj.balance = 1000.0;
        obj.withdraw(amount);

    }
}
