import java.util.Scanner;

// Class to store patient details
public class patient {

    // Data members
    int patient_id;
    String name;
    int age;
    String disease;

    // Method to display patient details
    void details()
    {
        System.out.println("Patient ID :- " + patient_id);
        System.out.println("Patient Name :- " + name);
        System.out.println("Patient Age :- " + age);
        System.out.println("Disease :- " + disease);
    }

    // Method to check senior citizen
    void check()
    {
        if(age >= 60)
            System.out.println("Patient is a Senior Citizen");
        else
            System.out.println("Patient is not a Senior Citizen");
    }

    // Main method
    public static void main(String[] args) {

        // Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Creating three patient objects
        patient p1 = new patient();
        patient p2 = new patient();
        patient p3 = new patient();

        // -------- First Patient --------
        System.out.println("Enter First Patient Details :-");

        System.out.println("Enter Patient ID :-");
        p1.patient_id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Patient Name :-");
        p1.name = sc.nextLine();

        System.out.println("Enter Patient Age :-");
        p1.age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Disease Patient Have :-");
        p1.disease = sc.nextLine();


        // -------- Second Patient --------
        System.out.println("Enter Second Patient Details :-");

        System.out.println("Enter Patient ID :-");
        p2.patient_id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Patient Name :-");
        p2.name = sc.nextLine();

        System.out.println("Enter Patient Age :-");
        p2.age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Disease Patient Have :-");
        p2.disease = sc.nextLine();


        // -------- Third Patient --------
        System.out.println("Enter Third Patient Details :-");

        System.out.println("Enter Patient ID :-");
        p3.patient_id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Patient Name :-");
        p3.name = sc.nextLine();

        System.out.println("Enter Patient Age :-");
        p3.age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Disease Patient Have :-");
        p3.disease = sc.nextLine();


        // Displaying details and checking senior citizen
        System.out.println("\n----- Patient Details -----");

        p1.details();
        p1.check();

        System.out.println();

        p2.details();
        p2.check();

        System.out.println();

        p3.details();
        p3.check();

        // Closing scanner
        sc.close();
    }
}