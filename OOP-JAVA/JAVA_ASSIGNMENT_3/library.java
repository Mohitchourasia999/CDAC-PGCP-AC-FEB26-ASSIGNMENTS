import java.util.Scanner;

public class library {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of books
        System.out.print("Enter size of the book list: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book b[] = new Book[n];

        // Input book details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter " + (i + 1) + " book details:");

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter title: ");
            String t = sc.nextLine();

            System.out.print("Enter author name: ");
            String a = sc.nextLine();

            // Create book object
            b[i] = new Book(id, t, a);
        }

        // Issue book
        System.out.println("\nEnter book details for issuing:");
        System.out.print("Enter title: ");
        String it = sc.nextLine();

        System.out.print("Enter author name: ");
        String ia = sc.nextLine();

        boolean f=true;
        for (int i = 0; i < n; i++) {
            if (b[i].title.equalsIgnoreCase(it)
                    && b[i].author.equalsIgnoreCase(ia)) {
                            f=true;
                // Check availability
                if (b[i].status.equalsIgnoreCase("Available")) {
                    System.out.println("Book available");
                    b[i].status = "Issued"; 
                } else {
                    System.out.println("Book not available");
                }
            }
        }
        if(!f)
        {
         System.out.println("Book is not in the library list");
        }

        // Return book
        System.out.println("\nEnter book details that you want to return:");
        System.out.print("Enter title: ");
        String rt = sc.nextLine();

        System.out.print("Enter author: ");
        String ath = sc.nextLine();

        for (int i = 0; i < n; i++) {
            if (b[i].title.equalsIgnoreCase(rt)
                    && b[i].author.equalsIgnoreCase(ath)) {

                // Mark as available
                b[i].status = "Available";
            }
        }

        // Display available books
        System.out.println("\nAvailable books:");
        for (int i = 0; i < n; i++) {
            if (b[i].status.equalsIgnoreCase("Available")) {
                System.out.println(b[i].title);
            }
        }

        // Display issued books
        System.out.println("\nIssued books:");
        for (int i = 0; i < n; i++) {
            if (b[i].status.equalsIgnoreCase("Issued")) {
                System.out.println(b[i].title);
            }
        }

        // Display all book details
        System.out.println("\nAll Book Details:");
        for (int i = 0; i < n; i++) {
            b[i].display();
        }

        // Display total books
        System.out.println("\nTotal books in library: " + Book.total);

        sc.close();
    }
}

// Book class
class Book {

    int bookid;
    String title;
    String author;
    String status;

    // static variable to track total books
    static int total = 0;

    // Constructor
    Book(int bookid, String title, String author) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        status = "Available"; // default status
        total++;
    }

    // Display method
    public void display() {
        System.out.println("\nBook Details:");
        System.out.println("Book ID: " + bookid);
        System.out.println("Title: " + title);
        System.out.println("Author Name: " + author);
        System.out.println("Status: " + status);
    }
}