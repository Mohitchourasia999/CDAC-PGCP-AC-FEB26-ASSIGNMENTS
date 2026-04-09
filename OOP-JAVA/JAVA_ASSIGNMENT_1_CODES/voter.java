import java.util.Scanner;
public class voter {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age to check eligibility for voting ");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("you are eligible for vote");
        }
        else
            System.out.println("you are not eligible for vote");
        sc.close();
    }
}
