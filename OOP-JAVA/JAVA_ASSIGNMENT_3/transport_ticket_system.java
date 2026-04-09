import java.util.*;

// Main class
public class transport_ticket_system {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // number of tickets
        System.out.println("enter size of transport ticket system:- ");
        int n = sc.nextInt();

        // array of ticket objects
        ticket t[] = new ticket[n];

        // input for each ticket
        for (int i = 0; i < n; i++) {

            System.out.print("enter id:- ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("enter passenger name:- ");
            String name = sc.nextLine();

            System.out.print("enter source naame:- ");
            String source = sc.nextLine();

            System.out.print("enter destination name:- ");
            String dest = sc.nextLine();

            System.out.print("enter fare:- ");
            double fare = sc.nextDouble();
            sc.nextLine();

            // create ticket object
            t[i] = new ticket(id, name, source, dest, fare);

            // ask for fare update
            System.out.println("For new fare enter yes otherwise no");
            String c = sc.nextLine();

            if (c.equalsIgnoreCase("yes")) {

                System.out.println("enter what type of fare is to be updated ");
                System.out.println("enter new for new fare and discount for discount in current fare");

                String nf = sc.nextLine();

                // update with new fare
                if (nf.equalsIgnoreCase("new")) {
                    System.out.print("enter new fare:- ");
                    double f = sc.nextDouble();
                    sc.nextLine();
                    t[i].updatefare(f);
                }

                // update with discount
                if (nf.equalsIgnoreCase("discount")) {
                    System.out.println("enter discount percentage");
                    int dis = sc.nextInt();
                    sc.nextLine();
                    t[i].updatefare(dis);
                }
            }
        }

        // display all tickets
        for (int i = 0; i < n; i++) {
            t[i].display();
        }

        // total fare of all tickets
        System.out.println("total fare:- " + ticket.totalfare);

        sc.close();
    }
}


// Ticket class
class ticket {

    int id;                 // ticket id
    String name;            // passenger name
    String source;          // source location
    String destination;     // destination location
    double fare;            // ticket fare

    static double totalfare = 0;   // total fare of all tickets

    // constructor
    ticket(int id, String name, String source, String destination, double fare) {
        this.id = id;
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
    }

    // method overloading -> update with new fare
    public void updatefare(double newfare) {
        fare = newfare;
    }

    // method overloading -> update with discount
    public void updatefare(int disc) {
        fare = fare - (fare * disc / 100);
    }

    // display ticket details
    public void display() {

        System.out.println("\nticket id:- " + id);
        System.out.println("passenger name:- " + name);
        System.out.println("source -> destination :- " + source + " -> " + destination);
        System.out.println("fare:- " + fare);

        // add to total fare
        totalfare += fare;
    }
}