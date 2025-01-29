import java.util.Scanner;

public class Circle {
    double area;
    double perimeter;
    final double Pi = 3.1416;
    void displayArea(double rad) {

        area = Pi*rad*rad;
        display(area);
    }

    void display(double area) {
        System.out.println("Area of the Circle : "+area);
    }

    void displayCircumference(double rand) {
        perimeter = 2 * Pi * rand;
        System.out.println("Perimeter : "+perimeter);
    }

    public static void main(String [] args) {

        Circle circle = new Circle();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Radius : ");
        double rad = scanner.nextDouble();

        circle.displayArea(rad);
        circle.displayCircumference(rad);

    }
}