import java.util.Scanner;

public class inventory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take total number of products
        System.out.print("Enter total products size: ");
        int n = sc.nextInt();

        Product p[] = new Product[n];

        // Input product details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for product " + (i + 1));

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter product name: ");
            String name = sc.nextLine();

            // Create product object
            p[i] = new Product(id, name, price, qty);
        }

        // Update product quantity and price
        System.out.print(
                "\nEnter product name to update (if none type NO): ");
        String s = sc.nextLine();

        System.out.print("Enter new price of product: ");
        double pp = sc.nextDouble();

        System.out.print("Enter quantity to update: ");
        int q = sc.nextInt();
        sc.nextLine();

        // Discount input
        System.out.print(
                "Enter product name on which you have to add discount: ");
        String dnam = sc.nextLine();

        System.out.print("Enter discount percentage: ");
        int d = sc.nextInt();

        // Apply updates
        for (int i = 0; i < n; i++) {

            String nam = p[i].name;

            // Update quantity and direct price
            if (nam.equalsIgnoreCase(s)) {
                p[i].updateQty(q);
                p[i].updatePrice(pp);
            }

            // Apply discount
            if (nam.equalsIgnoreCase(dnam)) {
                p[i].updatePrice(d);
            }
        }

        // Reset total before calculating
        Product.totalValue = 0;

        // Display all products
        System.out.println("\nProduct Details:");
        for (int i = 0; i < n; i++) {
            p[i].display();
        }

        // Display total inventory value
        System.out.println(
                "\nTotal Inventory Value: " + Product.totalValue);

        sc.close();
    }
}

// Product class
class Product {

    int id;
    String name;
    double price;
    int qty;

    // static variable to hold total inventory value
    static double totalValue = 0;

    // Constructor
    Product(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    // Update quantity
    public void updateQty(int q) {
        qty = q;
    }

    // Overloaded method for discount update
    public void updatePrice(int d) {
        price = price - (price * d / 100);
    }

    // Overloaded method for direct price update
    public void updatePrice(double p) {
        price = p;
    }

    // Display product details
    public void display() {
        System.out.println("\nProduct ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qty);

        double stockValue = price * qty;
        System.out.println("Stock Value: " + stockValue);

        // add to total inventory value
        totalValue += stockValue;
    }
}


