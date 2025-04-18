
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
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.animalSound();
        Cat cat = new Cat();
        cat.animalSound();

        Animal animal = new Animal();
        animal.animalSound();
    }

}
