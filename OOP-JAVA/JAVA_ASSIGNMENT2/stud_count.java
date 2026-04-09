public class stud_count {
    String name ;
    int rollno;
    static int totalstudents;
    void details()
    {
        System.out.println("name:- "+name);
        System.out.println("rollno:- "+rollno);
        
        totalstudents++;
    }
    static void display()
    {
       System.out.println("total students:- "+totalstudents);
    }
    public static void main(String[] args)
    {
        stud_count obj1=new stud_count();
        stud_count obj2=new stud_count();
        stud_count obj3=new stud_count();

        obj1.name="Mohit";
        obj1.rollno=102;
        obj1.details();

         obj2.name="Amit";
        obj2.rollno=102;
        obj2.details();

         obj3.name="Peter";
        obj3.rollno=103;
        obj3.details();

        stud_count.display();
        
    }
}
