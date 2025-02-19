
class Animal{
    public void animalSound() {
        System.out.println("Animal make a sound");
    }
}

class Dog extends Animal{
    @Override
    public void animalSound() {
        System.out.println("Dog sound woof");
    }
}

class Cat extends Animal{
    @Override
    public void animalSound() {
        System.out.println("Cat sound Mew");
    }
}



public class Polymorphism {

}
