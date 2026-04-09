import java.util.Scanner;
public class electricitybillcalculator {
           
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter customer name:- ");
        String name=sc.nextLine();
         System.out.println("enter consumer number:- ");
         long consumer_num=sc.nextLong();
          System.out.println("enter units consumed:- ");
          double units=sc.nextDouble();
          double total=0.0;
          if(units<=100)
          {
            total=units*5;
          }
          else if(units>=100&&units<=200)
          {
            double u1=units-100;
            total=(units-u1)*5+u1*7;
          }
          else
          {
            double u1=units-100;
            double u2=u1-100;
            total=(units-u1)*5+(u1-u2)*7+(units-(u1+u2))*10;
          }
          System.out.println("customer name:- "+name);
            System.out.println("consumer number:- "+consumer_num);
          if(total>1500)
          {
            System.out.println("surcharge added ant total is:- "+((total*5/100)+total));
          }
          else{
             System.out.println("total bill:-"+total);
          }
         sc.close();

    }
}
