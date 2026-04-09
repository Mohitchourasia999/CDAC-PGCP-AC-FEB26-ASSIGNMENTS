import java.util.Scanner;

// Class 1: Book
class Book {
    int bookId;
    String bookName;

    // Constructor to initialize book details
    Book(int id, String name) {
        bookId = id;
        bookName = name;
    }
}

// Class 2: Library
class Library {
    // Method to display all books
    void displayBooks(Book[] books) {
        System.out.println("\n--- Book Details in Library ---");
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book ID: " + books[i].bookId + ", Book Name: " + books[i].bookName);
        }
    }
}

// Main class
public class BookLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        Book[] books = new Book[n]; // array to store Book objects

        // Input book details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");

            System.out.print("Book ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            System.out.print("Book Name: ");
            String name = sc.nextLine();

            books[i] = new Book(id, name); // create Book object
        }

        // Create Library object and display all books
        Library lib = new Library();
        lib.displayBooks(books);

        sc.close();
    }
}