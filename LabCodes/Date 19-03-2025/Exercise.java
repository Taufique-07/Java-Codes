
abstract class $Shape {

    String color;
    abstract double getArea();
    public String toString() {
        return this.color;
    }
}

class $Rectangle extends $Shape {
    public int length;
    public int width;

    public double getArea() {
        return length * width;
    }
}

class Triangle extends $Shape {
    int base;
    int height;

    public double getArea() {
        return (double) 0.5*base*height;
    }
}

public class Exercise {
    public static void main(String[] args) {
        $Rectangle rectangle = new $Rectangle();
        rectangle.color = "Blue";
        rectangle.length = 5;
        rectangle.width = 6;
        rectangle.getArea();
        rectangle.toString();

        Triangle triangle = new Triangle();
        triangle.color = "Red";
        triangle.base = 4;
        triangle.height = 2;
        triangle.getArea();
        triangle.toString();
    }
}
