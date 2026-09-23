import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book(1, "Java Basics"));
        lib.addBook(new Book(2, "OOP Concepts"));

        Student s = new Student(101, "Honey");
        Librarian l = new Librarian(201, "Admin");

        s.displayInfo();
        l.displayInfo();

        lib.showBooks();
        lib.issueBook(1);
        lib.showBooks();
    }
}
