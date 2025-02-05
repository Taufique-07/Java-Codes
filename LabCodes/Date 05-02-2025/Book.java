import java.util.Scanner;

public class Book {
    String title;
    String author;
    double price;

    Book() {

        title = "Opekkha";
        author = "Humayon Ahmed";
        price = 458.00;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Book Title : ");
        String name = scanner.nextLine();
        System.out.print("Enter Book Author Name : ");
        String author = scanner.nextLine();
        System.out.print("Enter Book Book Price : ");
        double price = scanner.nextDouble();

        Book book1 = new Book();
        Book book2 = new Book(name,author);
        Book book3 = new Book(name,author,price);
        System.out.println("Book Title : " + book1.title + " " + "Author Name : " + book1.author + " " + "Price : " + book1.price);
        System.out.println("Book Title : " + book2.title  + " " + "Author Name : " + book2.author + " " + "Price : " + book2.price);
        System.out.println("Book Title : "   + book3.title + " " + "Author Name : " + book3.author + " " + "Price : " + book3.price);
    }


}