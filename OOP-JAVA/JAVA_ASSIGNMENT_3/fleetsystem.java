import java.util.Scanner;
class vehicle{

     String brand;
     double speed;
     static{
        System.out.println("vehicle systen initialized:-");
     }
     {
        System.out.println("new object is created");
     }
    vehicle(String b, double s)
    {
         brand=b;
         speed=s;
    }
   void update_speed(double newspeed)
   {
         speed=newspeed;  
   }
   void displaydetails()
   {
    System.out.println("vehicle details:-");
    System.out.println("\nbrand:- "+brand);
    System.out.println("speed:- "+speed);
   
   }
}
class car extends vehicle{
    String fuelType;
    double mileage;
    car(String b, double s , String f , double m)
    {
      super(b,s);
      fuelType=f;
      mileage=m;
    }
    void displaydetails()
   {
    super.displaydetails();
    System.out.println("\ncar details:-");
    System.out.println("fueltype:- "+fuelType);
    System.out.println("mileage:- "+mileage);
   }
}
class bike extends vehicle{
    String fuelType;
    double mileage;
    bike(String b, double s , String f , double m)
    {
      super(b,s);
      fuelType=f;
     mileage=m;
    }
    void displaydetails()
   {
    super.displaydetails();
    System.out.println("\nbike details:-");
    System.out.println("fueltype:- "+fuelType);
    System.out.println("mileage:- "+mileage);
   }
}
class fleetsystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter car details");
        System.out.print("\nbrand:- ");
        String s=sc.nextLine();
        System.out.print("fueltype:- ");
        String fuel=sc.nextLine();
        sc.nextLine();
        System.out.print("speed in km/hrs:- ");
        double d=sc.nextDouble();
        System.out.print("mileage:- ");
        double m=sc.nextDouble();
        car c=new car(s,d,fuel,m);

        sc.nextLine();
        System.out.println("\nif there is update on car speed enter YES othewrwise NO:- ");
        String opt=sc.nextLine();

        if(opt.equalsIgnoreCase("YES"))
        {
            System.out.println("enter updated speed of entered car ");
            double s1=sc.nextDouble();
            c.update_speed(s1);
            c.displaydetails();
        }
        else{
            c.displaydetails();
        }

          sc.nextLine();
        System.out.println("enter bike details");
        System.out.print("\nbrand:- ");
        String s1=sc.nextLine();
        System.out.print("fueltype:- ");
        String fuel1=sc.nextLine();
        System.out.print("speed in km/hrs:- ");
        double d1=sc.nextDouble();
        System.out.print("mileage:- ");
        double m1=sc.nextDouble();
        bike b=new bike(s1,d1,fuel1,m1);

        sc.nextLine();
        System.out.println("\nif there is update on car speed enter YES othewrwise NO:- ");
        String opt1=sc.nextLine();

        if(opt1.equalsIgnoreCase("YES"))
        {
            System.out.println("enter updated speed of entered car ");
            double s2=sc.nextDouble();
            b.update_speed(s2);
            b.displaydetails();
        }
        else{
            c.displaydetails();
        }
        sc.close();

        
    }
}
    

