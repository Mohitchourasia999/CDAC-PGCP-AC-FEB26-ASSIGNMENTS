import java.util.Scanner;

public class stud_mark {
    public static void main(String[] args) {
        
        // Scanner object for input
        Scanner sc = new Scanner(System.in);

        // 2D array to store marks of 3 students and 3 subjects
        int stud[][] = new int[3][3];

        System.out.println("Enter marks of 3 students in 3 subjects");

        // Taking input
        for (int i = 0; i < 3; i++) {
            System.out.println("\nMarks of Student " + (i + 1) + " :- ");

            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks in Subject " + (j + 1) + " : ");
                stud[i][j] = sc.nextInt();
            }
        }

        // Table Header
        System.out.println("\n-----------------------------------------------");
        System.out.println("Student No.\tTotal Marks\tAverage Marks");
        System.out.println("-----------------------------------------------");

        // Calculating total and average
        for (int i = 0; i < 3; i++) {
            int total = 0;

            for (int j = 0; j < 3; j++) {
                total = total + stud[i][j];
            }

            // Printing table row
            System.out.println((i + 1) + "\t\t" + total + "\t\t" + (total / 3));
        }

        System.out.println("-----------------------------------------------");

        // Closing scanner
        sc.close();
    }
}