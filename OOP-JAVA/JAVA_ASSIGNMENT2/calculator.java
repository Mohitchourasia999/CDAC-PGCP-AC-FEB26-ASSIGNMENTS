import java.util.Scanner;

public class calculator 
{
    // Method 1: addition of two integers
    void calculate(int a, int b)
    {
        System.out.println("addition of two values in integer:- " + (a + b));
    }

    // Method 2: addition of two double values (method overloading)
    void calculate(double a, double b)
    {
        System.out.println("addition of two values in dpouble:- " + (a + b));
    }

    // Method 3: addition of three integers (method overloading)
    void calculate(int a, int b, int c)
    {
        System.out.println("addition of three of same type:- " + (a + b + c));
    }

    public static void main(String[] args) 
    {
        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Creating object of calculator class
        calculator obj = new calculator();

        // Taking two integer inputs
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Calling integer addition method
        obj.calculate(a, b);

        // Taking two double inputs
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();

        // Calling double addition method
        obj.calculate(a1, b1);

        // Taking three integer inputs
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();

        // Calling three integer addition method
        obj.calculate(a2, b2, c2);

        // Closing scanner
        sc.close();
    }
}
