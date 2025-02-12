
class Employeee {
    String name ;
    int id ;
    String joiningDate ;


    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Joining Date: " + joiningDate);
    }
}

class SoftwareEmployee extends Employeee {
    double salary;

    SoftwareEmployee() {
        this.salary = 0.0;
    }

    SoftwareEmployee(double salary) {
        this.salary = salary;
    }

    public void displaySalary() {
        System.out.println("Salary: " + salary);
    }

}

class HR extends Employeee {
    double salary;

    HR() {
        this.salary = 0.0;
    }

    HR(double salary) {
        this.salary = salary;
    }

    public void displaySalary() {
        System.out.println("Salary: " + salary);
    }

}

public class Lab_Task {
    public static void main(String[] args) {


        Employeee employee = new Employeee();

        employee.name = "John Wick";
        employee.id = 700863;
        employee.joiningDate = "2021-10-30";
        employee.display();
        HR hr = new HR(90000);
        hr.name = "TauFique";
        hr.id = 34250;
        hr.joiningDate = "2021-10-30";
        hr.display();
        hr.displaySalary();
        SoftwareEmployee softwareEmployee = new SoftwareEmployee(50000);
        softwareEmployee.name = "Ziad";
        softwareEmployee.id = 700893;
        softwareEmployee.joiningDate = "2021-10-30";
        softwareEmployee.display();
        softwareEmployee.displaySalary();


    }
}