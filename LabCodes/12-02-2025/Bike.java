public abstract class Bike {

    Bike() {
        System.out.println("Bike constructor");
    }

    public abstract void run();
    public void changeGear() {
        System.out.println("Change gear");
    }

}

class Honda extends Bike {

    @Override
    public void run() {
        System.out.println("Honda is running");
    }
}
