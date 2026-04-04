import java.util.Scanner;
public class prime1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number : ");
        int n=sc.nextInt();
        int c=0;
        if(n>1)
        {
            for(int i=1;i<=100;i++)
            {
                if(n%i==0)
                    c++;
            }

           if(c==2)
           {
            System.out.println("entered number is prime");
           }
           else{
            System.out.println("entered number is not prime");
           }
        }
        else
            System.out.println("entered number is less than or equal to 1");
    sc.close();

    }
}

