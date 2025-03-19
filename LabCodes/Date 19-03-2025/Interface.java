
interface DriveAble {
    void drive();
    default void fuelUp () {
        System.out.println("Fuel Up");
    }
}

class $Car implements DriveAble {
    public void drive() {
        System.out.println("Car is Driving");
    }
}

class $Bike implements DriveAble {
    public void drive() {
        System.out.println("Bike is Driving");
    }
}

interface FlyAble {
    void fly();
}

// Multiple Inheritance Using Interface
class Plane implements DriveAble,FlyAble {
    public void fly() {
        System.out.println("Plane is Flying");
    }
    public void drive() {
        System.out.println("Plane is Driving in the Runway");
    }
}

public class Interface {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.fly();
        plane.drive();

        DriveAble car = new $Car();
        car.drive();

    }
}
