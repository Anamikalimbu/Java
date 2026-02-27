import java.util.ArrayList;
import java.util.List;

public class Library {

    public static void main(String[] args) {
        // Create sample books
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Pragmatic Programmer", "Andrew Hunt & David Thomas", "978-0201616224", 1999, "Programming", true));
        books.add(new Book("Clean Code", "Robert C. Martin", "978-0132350884", 2008, "Programming", false));
        books.add(new Book("The Road", "Cormac McCarthy", "978-0307387899", 2006, "Fiction", true));

        System.out.println("All books:\n--------------------");
        displayBooks(books);

        System.out.println("Available books:\n--------------------");
        displayAvailableBooks(books);

        System.out.println("Unavailable books:\n--------------------");
        displayUnavailableBooks(books);

        System.out.println("Available books published after 2000:\n--------------------");
        displayAvailableAndAfterYear(books, 2000);
    }

    private static void displayBooks(List<Book> books) {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    private static void displayAvailableBooks(List<Book> books) {
        for (Book b : books) {
            if (b.isAvailable()) {
                System.out.println(b);
            }
        }
    }

    private static void displayUnavailableBooks(List<Book> books) {
        for (Book b : books) {
            if (!b.isAvailable()) {
                System.out.println(b);
            }
        }
    }

    private static void displayAvailableAndAfterYear(List<Book> books, int year) {
        for (Book b : books) {
            if (b.isAvailable() && b.getPublicationYear() > year) {
                System.out.println(b);
            }
        }
    }
}
