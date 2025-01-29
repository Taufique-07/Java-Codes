import java.util.Scanner;

public class Employee {

    String employeeName;
    String jobTitle;
    double salary;

    void display () {
        System.out.println("Employee Details : ");
        System.out.println("Employee Name : "+employeeName);
        System.out.println("Employee Job Title : "+jobTitle);
        System.out.println("Employee Salary : "+salary);
    }

    void incrementSalary() {
        double newSalary = salary + 5000;
        System.out.println("Salary after Increment : "+newSalary);
    }

    void calculateSalary () {
        double updatedSalary = 12 * salary;
        System.out.println("Yearly Salary : "+updatedSalary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Enter Your Name : ");
        employee.employeeName = scanner.nextLine();
        System.out.print("Enter Your Job Title : ");
        employee.jobTitle = scanner.nextLine();
        System.out.print("Enter Your Salary : ");
        employee.salary = scanner.nextDouble();

        employee.display();
        employee.incrementSalary();
        employee.calculateSalary();
    }
}