import java.util.Scanner;

public class expense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter expenses for 7 days
        System.out.println("Accept expenses for 7 days:-");
        int exp[] = new int[7];

        // Input expenses for each day
        for (int i = 0; i < 7; i++) {
            System.out.println("Enter expense for day " + (i + 1) + " :- ");
            exp[i] = sc.nextInt();
        }

        // Initialize max, min, total, and indices for highest & lowest expense
        int max = exp[0];
        int min = exp[0];
        int total = 0;
        int high_i = 0;
        int low_i = 0;

        // Loop to calculate total, max, min, and their respective days
        for (int i = 0; i < 7; i++) {
            total += exp[i];  // Add current day's expense to total

            if (exp[i] > max) {
                max = exp[i];  // Update max if current expense is higher
                high_i = i;    // Store the index of highest expense
            }

            if (exp[i] < min) {
                min = exp[i];  // Update min if current expense is lower
                low_i = i;     // Store the index of lowest expense
            }
        }

        // Calculate average expense
        int avg = total / 7;

        // Display results
        System.out.println("Total weekly expense:- " + total);
        System.out.println("Average expense of 7 days:- " + avg);
        System.out.println("Highest expense:- " + max);
        System.out.println("Lowest expense:- " + min);
        System.out.println("Day on which highest expense occurred:- " + (high_i + 1));
        System.out.println("Day on which lowest expense occurred:- " + (low_i + 1));

        sc.close();
    }
}