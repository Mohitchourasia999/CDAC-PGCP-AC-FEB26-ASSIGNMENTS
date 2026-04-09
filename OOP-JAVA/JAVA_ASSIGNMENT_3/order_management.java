import java.util.Scanner;

// Main class for Order Management
public class order_management {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of orders
        System.out.println("enter size of order list");
        int n = sc.nextInt();

        // Array of order objects
        order o[] = new order[n];

        // Input for each order
        for (int i = 0; i < n; i++) {

            // Order ID
            System.out.print("enter order id:-  ");
            int id = sc.nextInt();
            sc.nextLine();

            // Customer Name
            System.out.print("enter customer name:- ");
            String name = sc.nextLine();

            // Number of items
            System.out.print("enter number of items customer order");
            int ni = sc.nextInt();
            sc.nextLine();

            // Arrays for items and price
            String item[] = new String[ni];
            double price[] = new double[ni];

            // Input items and price
            for (int j = 0; j < ni; j++) {

                System.out.print("item name:- ");
                item[j] = sc.nextLine();

                System.out.print("price:- ");
                price[j] = sc.nextDouble();

                sc.nextLine();
            }

            // Creating order object using constructor
            o[i] = new order(id, name, item, price);
        }

        // GST input
        System.out.print("\nenter GST:-");
        int g = sc.nextInt();

        // Calculate bill and display each order
        for (int i = 0; i < n; i++) {
            o[i].calculate(g);
            o[i].display();
        }

        sc.close();
    }
}

// Order class
class order {

    int id;             // order id
    String name;        // customer name
    String item[];      // items array
    double price[];     // price array

    double totalbill = 0;   // final bill amount

    // Constructor for initialization
    order(int id, String name, String item[], double price[]) {
        this.id = id;
        this.name = name;
        this.item = item;
        this.price = price;
    }

    // Method to calculate total bill with GST
    public void calculate(int gst) {

        // Adding all item prices
        for (int i = 0; i < price.length; i++) {
            totalbill += price[i];
        }

        // Applying GST
        totalbill = totalbill + (totalbill * gst / 100);
    }

    // Display order details
    public void display() {

        System.out.println("\norder details");
        System.out.println("orderid:- " + id);
        System.out.println("customer name:- " + name);

        System.out.println("items and there price that customer had ordered:-");
        System.out.println("\nitem -> price");

        // Printing items and price
        for (int i = 0; i < item.length; i++) {
            System.out.println(item[i] + " -> " + price[i]);
        }

        // Final bill
        System.out.println("final bill:- " + totalbill);
    }
}
