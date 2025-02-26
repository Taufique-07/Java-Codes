

class Caar {
    protected String model;
    protected String company;

    public Caar(String model, String company){
        this.model = model;
        this.company = company;
    }

    public void drive () {
        System.out.println("Driving " + this.model + " on " + this.company);
    }

    public void stop () {
        System.out.println("Stopping " + this.model);
    }
}

class Volvo extends Caar {
    private double price;
    private String productionYear;
    private String registrationNumber;
    Engine engine;
    DashBoard dashBoard;

    public Volvo(double price, String productionYear, String registrationNumber, Engine engine, DashBoard dashBoard,String model, String company){
        super(model, company);
        this.price = price;
        this.productionYear = productionYear;
        this.registrationNumber = registrationNumber;
        this.engine = engine;
        this.dashBoard = dashBoard;
    }

    public void changeFuel() {
        System.out.println("Changing fuel for " + this.productionYear + " on " + this.registrationNumber);
    }

    public void checkBattery() {
        System.out.println("Checking battery for " + this.productionYear + " on " + this.registrationNumber);
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductionYear() {
        return this.productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void carInfo() {
        System.out.println("Car Info : ");
        System.out.println("Model : "+this.model);
        System.out.println("Company : "+this.company);
        System.out.println("Price : "+this.price);
        System.out.println("Production Year : "+this.productionYear);
        System.out.println("Registration Number : "+this.registrationNumber);
        System.out.println("Engine : "+this.engine.getCapacity());
        System.out.println("Dash Board size : "+this.dashBoard.getSize());
        this.engine.checkCapacity();
        super.drive();
        super.stop();
    }
}

class Engine {
    private double capacity;

    public Engine(double capacity){
        this.capacity = capacity;
    }

    public void checkCapacity() {
        System.out.println("Checking Engine capacity : " + this.capacity);
    }

    public double getCapacity() {
        return this.capacity;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}

class DashBoard {
    private int size;

    public DashBoard(int size){
        this.setSize(size);
    }

    public int getSize(){
        return this.size;
    }

    public void setSize(int size){
        this.size = size;
    }
}


public class Lab6_Task {
    public static void main(String[] args) {
        Engine engine = new Engine(3);
        DashBoard dashBoard = new DashBoard(5);
        Volvo volvo = new Volvo(300,"2025", "T6549P", engine, dashBoard, "Volvo", "Ford");
        volvo.carInfo();
    }
}
