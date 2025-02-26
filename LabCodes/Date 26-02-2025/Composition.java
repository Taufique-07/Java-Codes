
class Library${
    private Book$[] books;

    public Library$(String[] titles) {
        this.books = new Book$[titles.length];
        for (int i = 0; i < titles.length; i++) {
            this.books[i] = new Book$(titles[i]);
        }
    }

    public void showBooks() {
        for (Book$ book : books) {
            System.out.println(book.getTitle());
        }
    }
}

class Book${
    private String title;

    public Book$(String title) {
        this.setTitle(title);
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}

class LibrarySystem {
    Member member;

    public LibrarySystem(Member member) {
        this.member = member;
    }

    public void showMember() {
        System.out.println("Member Name : " + member.getName());
    }
}

class Member {
    private String name;

    public Member(String name) {
        this.setName(name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class Composition {
    public static void main(String[] args) {
        String[] bookTitles = {"Java Programming", "Data Structures"};
        Library$ library$ = new Library$(bookTitles);

        Member member = new Member("Taufique");
        LibrarySystem librarySystem = new LibrarySystem(member);

        library$.showBooks();
        librarySystem.showMember();
    }

}
