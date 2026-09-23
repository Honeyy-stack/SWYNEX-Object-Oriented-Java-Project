import java.util.*;

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void showBooks() {
        for (Book b : books) {
            System.out.println(b.getId() + " - " + b.getTitle() +
                    (b.isIssued() ? " (Issued)" : " (Available)"));
        }
    }

    public void issueBook(int id) {
        for (Book b : books) {
            if (b.getId() == id && !b.isIssued()) {
                b.issueBook();
                System.out.println("Book issued!");
                return;
            }
        }
        System.out.println("Book not available");
    }
}
