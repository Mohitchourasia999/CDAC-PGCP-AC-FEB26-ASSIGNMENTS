import java.util.Scanner;
public class prime {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number : ");
        int n=sc.nextInt();
        int c=0;
        if(n>1)
        {
            System.out.println("prime numbers between 1 and "+n);
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(i%j==0)
                        c++;
                }
                if(c==2)
                    System.out.println(i);
                else c=0;
            }
           
        }
        else
            System.out.println("entered number is less than or equal to 1");
    sc.close();

    }
}
