
class Address{
    String city, state, country;
    Address (String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Bank{
    private String name;
    Employe employe;

    Bank (String name, Employe employe) {
        setName(name);
        this.employe = employe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Bank Name: " + getName());
        System.out.println("Employee Info: " + employe.name + " " + employe.id + " " + employe.address.city + " " + employe.address.country + " " + employe.address.state );
    }
}

class Person${
    public void display() {
        System.out.println("This method shows the Person Details.");
    }
}

class Employe extends Person${
    int id;
    String name;
    Address address;


    Employe (int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;

    }

    @Override
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.city + ", " + address.state + ", " + address.country);
    }

}

public class Aggregation {
    public static void main(String[] args) {

        Address address1 = new Address("San Francisco", "CA", "USA");
        Address address2 = new Address("Dhaka", "Savar", "Bangladesh");



        Employe employe1 = new Employe(1, "John", address1);
        Employe employe2 = new Employe(2, "Jane", address2);

        employe1.display();
        employe2.display();

        Bank bank1 = new Bank("San Francisco",employe1);
        Bank bank2 = new Bank("Dhaka",employe2);

        bank1.display();
        bank2.display();

    }
}
