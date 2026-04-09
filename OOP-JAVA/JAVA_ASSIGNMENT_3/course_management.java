import java.util.*;

public class course_management {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // size of course list
        System.out.print("enter size of course list:- ");
        int n = sc.nextInt();

        course c[] = new course[n];

        // input for each course
        for (int i = 0; i < n; i++) {

            System.out.println("enter courseid:-");
            int id = sc.nextInt();

            // number of students
            System.out.println("enter number of students");
            int ns = sc.nextInt();
            sc.nextLine();

            String stud[] = new String[ns];

            // input student names
            for (int j = 0; j < ns; j++) {
                System.out.print("enter student name:- ");
                stud[j] = sc.nextLine();
            }

            // number of courses
            System.out.print("enter number of courses:- ");
            int nc = sc.nextInt();
            sc.nextLine();

            String courses[] = new String[nc];
            double fee[] = new double[nc];

            // input course name and fee
            for (int k = 0; k < nc; k++) {

                System.out.print("enter course name:- ");
                courses[k] = sc.nextLine();

                System.out.print("enter fee for course:- ");
                fee[k] = sc.nextDouble();
                sc.nextLine();
            }

            // create object
            c[i] = new course(id, stud, courses, fee);
        }

        sc.close();

        // display
        for (int i = 0; i < n; i++) {
            c[i].display();
        }
    }
}

// course class
class course {

    int courseid;
    String stud[];
    String courses[];
    double fee[];

    static int count = 0;

    // constructor
    course(int courseid, String stud[], String courses[], double fee[]) {
        this.courseid = courseid;
        this.stud = stud;
        this.courses = courses;
        this.fee = fee;
        count++;
    }

    // display method
    public void display() {

        System.out.println("\nCourse details:- ");
        System.out.println("course id:- " + courseid);

        for (int i = 0; i < stud.length; i++) {

            System.out.println("Student:- " + stud[i]);

            for (int j = 0; j < courses.length; j++) {
                System.out.println(courses[j] + " -> " + fee[j]);
            }
        }
    }
}