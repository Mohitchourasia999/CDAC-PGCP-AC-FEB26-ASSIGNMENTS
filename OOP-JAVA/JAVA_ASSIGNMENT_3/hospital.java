import java.util.Scanner;

public class hospital {

    public static void main(String[] args) {

        // Create scanner object for input
        Scanner sc = new Scanner(System.in);

        // Ask user for number of patients
        System.out.println("enter size of patient record");
        int n = sc.nextInt();

        // Arrays to store patient and contact details
        patient p[] = new patient[n];
        contactdetails cd[] = new contactdetails[n];

        // Loop to take input for each patient
        for (int i = 0; i < n; i++) {

            System.out.print("enter id:- ");
            int id = sc.nextInt();

            System.out.print("enter age:- ");
            int age = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("enter name:- ");
            String name = sc.nextLine();

            System.out.print("enter disease patient has:- ");
            String dis = sc.nextLine();

            System.out.print("enter status(admitted/discharge/critical/under preservation):- ");
            String status = sc.nextLine();

            // Contact details input
            System.out.println("enter contact details");

            System.out.print("mobno:- ");
            String mobno = sc.nextLine();

            System.out.print("email:- ");
            String email = sc.nextLine();

            // Create contactdetails object
            cd[i] = new contactdetails(mobno, email);

            // Create patient object using composition
            p[i] = new patient(id, name, age, dis, status, cd[i]);
        }

        // Display all patient records
        for (int i = 0; i < n; i++) {
            System.out.println("patient " + (i + 1) + " records:- ");
            p[i].patientdetails();
        }

        // Close scanner
        sc.close();
    }
}


// Class to store contact details
class contactdetails {

    String mobno;
    String email;

    // Constructor
    contactdetails(String mobno, String email) {
        this.mobno = mobno;
        this.email = email;
    }

    // Method to display contact details
    public void display() {
        System.out.println("mobile number:- " + mobno);
        System.out.println("email:- " + email);
    }
}


// Patient class (uses composition with contactdetails)
class patient {

    int id;
    String name;
    int age;
    String dis;
    String status;

    // Object of contactdetails class
    contactdetails contactinfo;

    static int count = 0;

    // Constructor
    patient(int id, String name, int age, String dis, String status, contactdetails contactinfo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.status = status;
        this.dis = dis;
        this.contactinfo = contactinfo;
    }

    // Method to display patient details
    public void patientdetails() {

        System.out.println("id:- " + id);
        System.out.println("name:- " + name);
        System.out.println("age:- " + age);

        // Check for senior citizen
        if (age >= 60) {
            System.out.println("comes under senoirity");
        }

        System.out.println("disease:- " + dis);
        System.out.println("status:- " + status);

        // Display contact details using composition
        contactinfo.display();
    }
}