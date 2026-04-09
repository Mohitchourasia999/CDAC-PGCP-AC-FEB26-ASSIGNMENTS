import java.util.Scanner;

// Class to represent a Student
class Student {
    int rollno;       // Student roll number
    String name;      // Student name
    int marks[];      // Marks in multiple subjects
    long phoneno;     // Phone number
    String email;     // Email address
    static int totalstudents = 0;  // Tracks total students created

    // Constructor to initialize a Student object
    Student(int id, String nam, int mark[], long mob, String e) {
        rollno = id;
        name = nam;
        marks = mark;
        phoneno = mob;
        email = e;
        totalstudents++;  // Increment total students count
    }

    // Method to calculate total marks
    double totalmarks() {
        double total = 0.0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }

    // Method to calculate average marks
    double avgmarks() {
        return totalmarks() / marks.length;
    }

    // Method to display the student report
    void displayreport() {
        System.out.println("\n==============================");
        System.out.println("Student Report");
        System.out.println("------------------------------");
        System.out.println("Roll No     : " + rollno);
        System.out.println("Name        : " + name);
        System.out.println("Phone       : " + phoneno);
        System.out.print("Marks       : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + " = " + marks[i]);
            if (i != marks.length - 1) System.out.print(", "); // comma separation
        }
        System.out.println();
        System.out.println("Total Marks : " + totalmarks());
        System.out.println("Average     : " + avgmarks());
        System.out.println("==============================");
    }
}

// Main class to run the College ERP program
class CollegeERP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Array to store multiple Student objects
        Student stud[] = new Student[n];

        // Input details for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("Roll Number : ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Name        : ");
            String nam = sc.nextLine();

            System.out.print("Number of subjects: ");
            int n1 = sc.nextInt();

            int marks[] = new int[n1];
            for (int j = 0; j < n1; j++) {
                System.out.print("Marks for subject " + (j + 1) + " : ");
                marks[j] = sc.nextInt();
            }
            sc.nextLine(); // consume newline

            System.out.print("Phone Number: ");
            long mob = sc.nextLong();
            sc.nextLine(); // consume newline

            System.out.print("Email       : ");
            String e = sc.nextLine();

            // Create a new Student object and store in array
            stud[i] = new Student(id, nam, marks, mob, e);
        }

        // Display reports for all students
        System.out.println("\n===== STUDENT REPORTS =====");
        for (int i = 0; i < n; i++) {
            stud[i].displayreport();
        }

        // Display total students admitted
        System.out.println("\nTotal students attended: " + Student.totalstudents);

        sc.close();
    }
}