
import java.util.*;

public class Constructor {
    // if there are no parameter in the constructor its known as no argument constructor

    String name;
    Constructor() {
        this.name = "Object Oriented Programming";
    }
    Constructor(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Constructor object1 = new Constructor();
        Constructor object2 = new Constructor(name);
        Constructor object3 = new Constructor("Taufique");

        System.out.println(object1.name);
        System.out.println(object2.name);
        System.out.println(object3.name);

    }

}