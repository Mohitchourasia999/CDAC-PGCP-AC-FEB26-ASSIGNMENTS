import java.util.Scanner;
 class employee{
          int emp_id;
          String name;
          double salary;
          static int total=0;
          double sal_allowance=0.0;
          employee(int emp_id,String name, double salary)
          {
            this.emp_id=emp_id;
            this.name=name;
            this.salary=salary;
            total++;
          }
          public void calculatesalary(int percent)
          {
           sal_allowance =salary+(salary*percent/100);
          }
          public void calculatesalary(double amt)
          {
            sal_allowance=salary+amt;
          }
          public void display()
          {
                System.out.println("employee details:- ");
                System.out.println("\nid:-"+emp_id);
                System.out.println("name:- "+name);
                System.out.println("basic salary:- "+salary);
                System.out.println("salary with allowance:- "+sal_allowance);
                

          }

}
class employee_management {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);

    System.out.println("enter employee list size");
    int n=sc.nextInt(); 

    employee e[]=new employee[n];

    for(int i=0;i<n;i++)
    {
        System.out.print("\nenter employee id:- ");
        int id=sc.nextInt();
        sc.nextLine();

        System.out.print("enter employee name:- ");
        String name=sc.nextLine();

        System.out.print("enter employee salary:- ");
        double sal=sc.nextDouble();
        sc.nextLine();

         e[i]=new employee(id, name, sal);

         double fixed_allowance=0.0;
         int percent_allowance=0;

        System.out.println("\nenter allowance type employee has among fixed or percentage");
        String alwnc_type=sc.nextLine();

        if(alwnc_type.equalsIgnoreCase("fixed"))
        {
            System.out.println("enter fixed allowance amount employee has");
             fixed_allowance=sc.nextDouble();
             e[i].calculatesalary(fixed_allowance);

        }
        if(alwnc_type.equalsIgnoreCase("percentage"))
        {
            System.out.println("enter allowance percentage employee get");
              percent_allowance=sc.nextInt();
               e[i].calculatesalary(percent_allowance);

        }

        
    }
    
sc.close();

    for(int i=0;i<n;i++)
    {
        e[i].display();
    }

    System.out.println("\ntotal employee:- "+employee.total);

    
}
}
