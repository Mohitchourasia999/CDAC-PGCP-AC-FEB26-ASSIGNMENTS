import java.util.Scanner;

public class restaurant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of items
        System.out.println("Enter size of menu list:");
        int n = sc.nextInt();

        String item[] = new String[n];
        int price[] = new int[n];

        // Input item names and prices
        for (int i = 0; i < n; i++) {
            sc.nextLine(); // clear buffer

            System.out.println("Enter name of item " + (i + 1) + ":");
            item[i] = sc.nextLine();

            System.out.println("Enter price of item " + (i + 1) + ":");
            price[i] = sc.nextInt();
        }

        // Display menu
        System.out.println("\n----------- MENU -----------");
        System.out.println("S.No\tItem Name\tPrice");

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + item[i] + "\t\t" + price[i]);
        }

        // Ordering section
        System.out.println("\nEnter Y to start ordering:");
        char c = sc.next().charAt(0);

        double total = 0.0;

        // Loop for multiple orders
        while (c == 'Y') {

            sc.nextLine(); // clear buffer

            System.out.println("\nEnter item name from above list:");
            String s = sc.nextLine();

            System.out.println("Enter quantity:");
            int qty = sc.nextInt();

            // Searching item in list
            for (int i = 0; i < n; i++) {

                // String comparison (fixed)
                if (item[i].equalsIgnoreCase(s)) {

                    double t = price[i] * qty;

                    System.out.println("\nItem\tPrice\tQty\tAmount");
                    System.out.println(item[i] + "\t" + price[i] + "\t" + qty + "\t" + t);

                    total += t;
                }
            }

            // Ask for more orders
            System.out.println("\nIf you want to order more enter Y otherwise N:");
            char ch = sc.next().charAt(0);
            c = ch;
        }

        // Adding 5% GST
        total = total + (total * 0.05);

        // Final bill
        System.out.println("\n-----------------------------------");
        System.out.println("Final Bill (Including 5% GST): " + total);
        System.out.println("-----------------------------------");

        sc.close();
    }
}