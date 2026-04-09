import java.util.*;

public class e_commerce_inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Electronics Input
        System.out.println("Enter electronic product details");
        System.out.print("Enter product name:- ");
        String name = sc.nextLine();

        System.out.print("Price:- ");
        double price = sc.nextDouble();
        sc.nextLine();   // consume newline

        Electronics e = new Electronics(name, price);

        Inventory<Electronics> ie = new Inventory<>();
        ie.addProduct(e);

        Electronics e1 = ie.getData();
        e1.display();

        System.out.println("---------------------------");

        // Clothing Input
        System.out.println("Enter clothing product details");
        System.out.print("Enter cloth name:- ");
        String nam = sc.nextLine();

        System.out.print("Price:- ");
        double p = sc.nextDouble();
        sc.nextLine();   // consume newline (important)

        System.out.print("Enter size of cloth:- ");
        String s = sc.nextLine();

        Clothing c = new Clothing(nam, s, p);

        Inventory<Clothing> ic = new Inventory<>();
        ic.addProduct(c);

        Clothing c1 = ic.getData();
        c1.display();

        sc.close();
    }
}

// Electronics Class
class Electronics {
    String name;
    double price;

    Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Electronic product name:- " + name);
        System.out.println("Price:- " + price);
    }
}

// Clothing Class
class Clothing {
    String name;
    String size;
    double price;

    Clothing(String name, String size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public void display() {
        System.out.println("Cloth name:- " + name);
        System.out.println("Size:- " + size);
        System.out.println("Price:- " + price);
    }
}

// Generic Inventory Class
class Inventory<T> {
    T data;

    public void addProduct(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}