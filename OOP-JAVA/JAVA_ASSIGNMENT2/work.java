import java.util.Scanner;

public class work {
    public static void main(String[] args) {

        // Scanner for user input
        Scanner sc = new Scanner(System.in);

        // Total employees
        System.out.print("Enter total number of employees working: ");
        int n = sc.nextInt();

        // Jagged array for storing working hours
        int hrs[][] = new int[n][];

        // Input section
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter number of days employee " + (i + 1) + " worked: ");
            int n1 = sc.nextInt();

            // allocating columns dynamically
            hrs[i] = new int[n1];

            for (int j = 0; j < n1; j++) {
                System.out.print("Enter hours employee " + (i + 1) + 
                                 " worked on day " + (j + 1) + " : ");
                hrs[i][j] = sc.nextInt();
            }
        }

        // Final Display
        System.out.println("\n========== ALL EMPLOYEE REPORT ==========\n");

        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + " Working Details:");
            System.out.println("-----------------------------------");

            for (int j = 0; j < hrs[i].length; j++) {
                System.out.println("Day " + (j + 1) + " : " + hrs[i][j] + " hrs");
            }
            System.out.println();
        }

        sc.close();
    }
}