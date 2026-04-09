import java.util.Scanner;

// Mobile Recharge System Application
public class mobile_recharge_system {
    public static void main(String[] args) {

        // Creating Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking mobile number input
        System.out.println("Enter Your Mobile Number:");
        long mob_no = sc.nextLong();

        // Taking recharge amount input
        System.out.println("Enter Recharge Amount:");
        int r_amt = sc.nextInt();

        // Displaying available recharge plans
        System.out.println("\nAvailable Plans:");
        System.out.println("199  ->  28 Days Validity");
        System.out.println("399  ->  56 Days Validity");
        System.out.println("599  ->  84 Days Validity");

        // Variable to store validity days
        int day = 0;

        // Checking recharge amount using switch-case
        switch (r_amt) {
            case 199:
                day = 28;
                break;

            case 399:
                day = 56;
                break;

            case 599:
                day = 84;
                break;

            // If user enters invalid amount
            default:
                System.out.println("Invalid Recharge Amount!");
        }

        // If valid plan selected
        if (day != 0) {
            System.out.println("\nRecharge Successful");
            System.out.println("------------------------------");
            System.out.println("Mobile Number   : " + mob_no);
            System.out.println("Recharge Amount : " + r_amt);
            System.out.println("Validity        : " + day + " Days");
        }
        // If no plan found
        else {
            System.out.println("According To Entered Recharge Amount, No Such Plan Is Available.");
        }

        // Closing scanner
        sc.close();
    }
}