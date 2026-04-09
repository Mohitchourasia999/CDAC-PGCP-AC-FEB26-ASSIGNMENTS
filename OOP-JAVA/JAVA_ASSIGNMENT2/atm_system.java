import java.util.Scanner;
public class atm_system {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your current account balance");
        float bal=sc.nextFloat();
        System.out.println("============ATM System===========");
         System.out.println("Enter 1 to check balance:- ");
         System.out.println("Enter 2 to deposit money");
         System.out.println("Enter 3 to withdraw money");
          System.out.println("Enter 4 to Exit");
          while(true)
          {
           System.out.println("Enter your Choice:-");
           int choice=sc.nextInt();
        
            switch(choice)
            {
                case 1:
                    {
                        System.out.println("Available balance:- "+bal);
                        break;
                    }

                case 2:
                    {
                        System.out.println("Enter Deposit Amount:-");
                        float amt=sc.nextFloat();
                        bal=bal+amt;
                        System.out.println("Updated Balance:-"+bal);
                        break;
                    }    

                   case 3:
                    {
                        System.out.println("Enter Withdraw Amount:-");
                        float amt=sc.nextFloat();
                        if(amt>=bal)
                        {
                            System.out.println("Insufficient Balance");
                            break;
                        }
                        else
                        {
                            bal=bal-amt;
                            System.out.println("Updated Balance:- "+bal);
                            break;
                        }
                    
                    }

                    case 4:
                        {
                       System.out.println("Thank you! for using ATM");
                       sc.close();
                       break;
                        }
                        default:
                            System.out.println("You have Enter a wrong choice");
            }
        
           }

    }
}
