import java.util.Scanner;

class InvalidVoterIDException extends Exception {
    InvalidVoterIDException(String message) {
        super(message);
    }

}


public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = scanner.nextInt();
        try {
            if (age < 18) {
                throw new InvalidVoterIDException("This is InvalidVoterID Exception");
            }
            else {
                System.out.println("You are Above 18.");
            }
        }
        catch (InvalidVoterIDException e) {
            System.out.println(e.getMessage());
        }
    }
}
