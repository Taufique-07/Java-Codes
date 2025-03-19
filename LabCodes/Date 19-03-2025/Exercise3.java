
interface Machine  {
    void start();
    void stop();
}

class $Car implements Machine {
    public void start() {
        System.out.println("Car started");
    }
    public void stop() {
        System.out.println("Car stopped");
    }
}

class WaterClass implements Machine {
    public void start() {
        System.out.println("Water started");
    }
    public void stop() {
        System.out.println("Water stopped");
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Machine car = new $Car();
        car.start();
        car.stop();
        Machine waterPump = new WaterClass();
        waterPump.start();
        waterPump.stop();
    }
}
