import java.util.Scanner;

class Boook{
    String title;
    double price;
    Author author;

    Boook(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Author Details: " );
        System.out.println("Author Name : " + author.name);
        System.out.println("Author Writing Area : " + author.fictionName);
    }
}

class Author{
    String name;
    String fictionName;

    Author(String name, String fictionName) {
        this.name = name;
        this.fictionName = fictionName;
    }

    public void writeBook() {
        System.out.println("This Author Can't Write a Book!");
    }

}

public class Lab5_Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name of the Author : ");
        String name = scanner.nextLine();
        System.out.print("Enter Fiction Name of the Author : ");
        String fictionName = scanner.nextLine();
        Author author = new Author(name, fictionName);
        System.out.print("Enter Book Title : ");
        String title = scanner.nextLine();
        System.out.print("Enter Book Price : ");
        double price = scanner.nextDouble();
        Boook book = new Boook(title, price, author);
        book.display();
    }

}
