import java.util.Scanner;
public class add_sub {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("-----------choices----------");
        System.out.println("enter 1 for addition");
         System.out.println("enter 2 for substraction");
         System.out.println("enter 3 to exit the program");
         System.out.println("enter two numbers");
         int a=sc.nextInt();
         int b=sc.nextInt();
         System.out.println("enter your choice : ");
         int c=sc.nextInt();
         switch(c)
         {
            case 1:
                System.out.println((a+b));
                break;

            case 2:
                System.out.println((a-b));
                break;
                
             case 3:
                System.exit(0);
                
                default :
                System.out.println("you have enter a wrong choice");


         }
         sc.close();
    
    }
}
