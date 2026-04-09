import java.util.Scanner;
public class salary_slip {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter employee name:-");
        String name=sc.nextLine();
         System.out.println("Enter employee id:- ");
         int id=sc.nextInt();
          System.out.println("Enter basic salary of employee:- ");
          double sal=sc.nextDouble();
          double hra=sal*0.2;
          double da=sal*0.1;
          double pf=sal*0.08;
          double net_salary=sal+hra+da-pf;
           System.out.println("---------SALARY SLIP---------");
            System.out.println("Employee name :-"+name);
            System.out.println("Employee id   :- "+id);
            System.out.println("Basic Salary  :- "+sal);
            System.out.println("HRA           :- "+hra);
            System.out.println("DA            :- "+da);
            System.out.println("PF            :- "+pf);
            System.out.println("------------------------------");
            System.out.println("Net Salary  :- "+net_salary);
            System.out.println("-------------------------------");
        sc.close();
    }
}

