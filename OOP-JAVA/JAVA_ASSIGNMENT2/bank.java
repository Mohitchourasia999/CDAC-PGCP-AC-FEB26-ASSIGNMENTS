import java.util.Scanner;

// Bank class to store account details
public class bank 
{
    // Data members
    String name;
    long accno;
    double bal;

    // Default Constructor
    bank()
    {
        // Assigning default values
        name = "Not available";
        accno = 0;
        bal = 0.0;

        // Message to show constructor is called
        System.out.println("default constructor is called");
    }

    // Parameterized Constructor
    bank(String n , long a , double b)
    {
        // Assigning values using parameters
        name = n;
        accno = a;
        bal = b;
    }

    // Method to display account details
    void details()
    {
        System.out.println("\n---- Account Details ----");
        System.out.println("Account Holder Name : " + name);
        System.out.println("Account Number      : " + accno);
        System.out.println("Available Balance   : " + bal);
    }

    // Main method
    public static void main(String[] args) 
    {
        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Creating object using default constructor
        bank b = new bank();

        // Display default values
        b.details();

        // Taking input from user
        System.out.println("\nEnter Account Holder Name : ");
        String n = sc.nextLine();

        System.out.println("Enter Account Number : ");
        long a = sc.nextLong();

        System.out.println("Enter Available Balance : ");
        double d = sc.nextDouble();

        // Creating object using parameterized constructor
        bank b1 = new bank(n, a, d);

        // Display entered values
        b1.details();

        // Closing scanner
        sc.close();
    }
}