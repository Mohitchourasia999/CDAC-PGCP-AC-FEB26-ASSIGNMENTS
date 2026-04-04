import java.util.Scanner;
public class loops {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 to print number using for loop");
        System.out.println("enter 2 to print number using while loop");
        System.out.println("now enter your choice:");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
                {
                    for(int i=1;i<=50;i++)
                    {
                        System.out.println(i);
                    }
                }
                break;

           case 2:
            {
                int i=1;
                while(i<=50)
                {
                    System.out.println(i);
                    i++;
                }
            } 
            break;
            default:
                System.out.println("you have entered a wrong choice");

        }
        sc.close();
        
    }
}
