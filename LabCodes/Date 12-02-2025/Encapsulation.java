import java.util.Scanner;

/*
         Encapsulation code
 */
class Person {
    private String name;
    private int age;
    public String department;

    // Default Constructor
    Person() {
        this.name = "";
        this.age = 0;
        this.department = "";
    }

    // Parameterized Constructor
    Person(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // set methode for name
    public void setName(String name) {
        this.name = name;
    }

    // get methode for age
    public String getName() {
        return this.name;
    }

    // set method for age
    public void setAge(int age) {
        this.age = age;
    }

    // get method for age
    public int getAge() {
        return this.age;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        person.setName(name);
        System.out.print("Enter your Age : ");
        int age = scanner.nextInt();
        person.setAge(age);
        System.out.println("Enter your department: ");
        person.department = scanner.nextLine();

        System.out.println(person.getName() + " " +  person.getAge());

        Person person1 = new Person("John Wick",37,"Killing");
        System.out.println(person1.getName() + " " + person1.getAge() + " " + person1.department);

    }
}