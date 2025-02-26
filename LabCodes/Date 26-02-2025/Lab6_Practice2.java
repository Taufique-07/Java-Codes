
class Car$ {
    private Engine$ engine$;

    public Car$() {
        this.engine$ = new Engine$("Engine");
    }
    public void startCar() {
        System.out.println("Car started with an Engine");
    }

    public void checkInfo() {
        System.out.println("Check info :");
        this.engine$.start();
    }
}

class Engine$ {
    private String type;

    public Engine$(String type) {
        this.setType(type);
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("Car Engine Started!");
    }
}

class Driver$ {
    private String name;

    public Driver$(String name) {
        this.setName(name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Bus {
    private Driver$ driver;

    public Bus(Driver$ driver) {
        this.driver = driver;
    }

    public void showDriver() {
        System.out.println("Driver Name : " + driver.getName());
    }
}

public class Lab6_Practice2 {
    public static void main(String[] args) {
        Car$ car = new Car$();
        car.startCar();
        car.checkInfo();
        Driver$ driver = new Driver$("Rapi");
        Bus bus = new Bus(driver);
        bus.showDriver();
    }
}
