import java.util.Scanner;
public class student_result_processing_system {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student name:- ");
        String name=sc.nextLine();
        System.out.println("enter student roll number:- ");
        int roll_number=sc.nextInt();
        System.out.println("enter student marks in subject:- ");
        System.out.println("English:- ");
        float eng=sc.nextFloat();
         System.out.println("cpp:- ");
         float c=sc.nextFloat();
          System.out.println("DBT:- ");
          float db=sc.nextFloat();
           System.out.println("OOPJ:- ");
           float ops=sc.nextFloat();
            System.out.println("DSA:- ");
            float dsa=sc.nextFloat();
            float total=eng+c+db+ops+dsa;
            float avg=total/5;
            System.out.println("Student name:-"+name);
                  System.out.println("student roll number:- "+roll_number);
                  System.out.println("marks in english:- "+eng);
                  System.out.println("marks in cpp:- "+c);
                  System.out.println("marks in dbt:- "+db);
                  System.out.println("marks in oops:- "+ops);
                  System.out.println("marks in dsa:-"+dsa);
             System.out.println("Total marks obtain by "+name+" in 5 subjects is:- "+total);
             System.out.println("Average marks obtain by "+name+" is:- "+avg);
             float percent=total*100/500;
              System.out.println("percentage:- "+percent);
              if(percent>=90)
              {
                 System.out.println("Grade:- A" );
                  System.out.println("Student is promoted");
              }
              else if(percent>=75&&percent<=89)
              {
                 System.out.println("Grade:- B");
                  System.out.println("Student promoted");
              }
              else if(percent>=60&&percent<=74)
              {
                System.out.println("Grade:- C");
                  System.out.println("Student promoted");
              }
              else if(percent>=40&&percent<=59)
              {
                System.out.println("Grade:- D");
                  System.out.println("Student promoted");
              }
              else
              {
                  System.out.println("Student not promoted");
              }

sc.close();

    }
}
