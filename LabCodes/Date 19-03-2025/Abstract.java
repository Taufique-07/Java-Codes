
abstract class Shape {
    abstract double area();

    public void display() {
        System.out.println("Area: " + area());
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

class $Circle extends Shape {
    double radius;
    public $Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
    }

}

public class Abstract {
    public static void main(String[] args) {
        Shape circle = new $Circle(4.0);
        circle.area();
        circle.display();

        Shape rectangle = new Rectangle(5.0, 5.0);
        rectangle.area();
        rectangle.display();
        
    }
}
