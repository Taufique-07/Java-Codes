import java.util.Scanner;


class Student {
    String firstName;
    String lastName;
    int age;

    void inset(String first, String last, int a) {
        firstName = first;
        lastName = last;
        age = a;

    }

    void display() {
        System.out.println("Details : ");
        System.out.println("First Name : "+firstName);
        System.out.println("Last Name : "+lastName);
        System.out.println("Age : "+age);
    }

}

public class Lab02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name : ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name : ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Age : ");
        int age = scanner.nextInt();

        Student student = new Student();

        student.firstName = firstName;
        student.lastName = lastName;
        student.age = age;
        scanner.nextLine();

        System.out.println("Details : ");
        System.out.println("First Name : "+student.firstName);
        System.out.println("Last Name : "+student.lastName);
        System.out.println("Age : "+student.age);

        System.out.print("Enter First Name : ");
        String firstName1 = scanner.nextLine();

        System.out.print("Enter Last Name : ");
        String lastName1 = scanner.nextLine();
        System.out.print("Enter Age : ");
        int age1 = scanner.nextInt();

        Student student1 = new Student();

        student1.firstName = firstName1;
        student1.lastName = lastName1;
        student1.age = age1;
        scanner.nextLine();


        //student.inset(firstName,lastName,age);
        student.inset(firstName1,lastName1,age1);
        //student.display();
        student1.display();

    }
}