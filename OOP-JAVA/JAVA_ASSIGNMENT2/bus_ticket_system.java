import java.util.Scanner;
public class bus_ticket_system {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int seatno[]={1,2,3,4,5,6,7,8,9,10};
        int seats[]=new int[10];
        System.out.println(" Enter availability on each seat as 0 for available or 1 for booked");
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter  availability status on seat number :- "+seatno[i]);
            seats[i]=sc.nextInt();
        }
        System.out.println("Enter 1 to view available seats");
        System.out.println("Enter 2 to Book a seat");
        System.out.println("Enter 3 to cancel a seat");
        System.out.println("Enter 4 to Exit ");
        boolean run=true;
        while(run)
        {
        System.out.println("Enter your choice:- ");
        int choice=sc.nextInt();

         switch(choice)
         {
            case 1:
                {
                     for(int i=0;i<10;i++)
                     {
                        if(seats[i]==0)
                        {
                        System.out.println("seat no. "+seatno[i]+" is Available");
                        }
                        else{
                            System.out.println("seat no. "+seatno[i]+" is Booked");
                        }
                     }
                     break;
                }

                case 2:
                    {
                        while(true)
                        {
                       System.out.println("enter the seat number you want to book");
                       int snum=sc.nextInt(); int c=0;
                       for(int i=0;i<10;i++)
                       {
                        if(seatno[i]==snum)
                        {
                           if(seats[i]==0)
                           {
                            System.out.println("seat is available you can book it ");
                            seats[i]=1;
                            c=1;
                           }
                           
                        }
                       }
                       if(c==1)
                       {
                        System.out.println("seat booked successfully");
                        break;
                       }
                       else{
                            System.out.println("seat not available enter another seat number");
                        }
                    }
                    break;
                }
                
                    case 3:
                        {
                               System.out.println("enter your seat details for cancelation");
                               System.out.println("seat number:- ");
                               int snum=sc.nextInt(); int c=0;
                               for(int i=0;i<10;i++)
                               {
                                if(seatno[i]==snum)
                                {
                                    seats[i]=0;
                                    System.out.println("seat cancelled successfully");
                                    c=1;
                                }

                               }
                               if(c==0)
                                System.out.println("already free");
                        }
                        break;

                        case 4:
                            {
                                System.out.println("Thank you for booking ticket");
                                run=false;

                            }
                            break;
                             

                            default:
                                System.out.println("You have entered a wrong choice");

         }
           
        }
        sc.close();
    }
}
