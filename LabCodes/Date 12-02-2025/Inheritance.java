import java.util.Scanner;

class Vehicle {

    protected String brandName;

    Vehicle() {
        this.brandName = "BMW";
    }

    Vehicle(String brandName) {
            this.brandName = brandName;
    }

    public void honk() {
        System.out.println("Tuut Tuut!");
    }
}

class Car extends Vehicle {
    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();
        System.out.print("Enter the vehicle's brand: ");

        car.brandName = scanner.nextLine();
        System.out.print("Enter the vehicle's model: ");
        String model = scanner.nextLine();
        car.setModel(model);

        System.out.println(car.getModel());
        car.honk();


    }
}