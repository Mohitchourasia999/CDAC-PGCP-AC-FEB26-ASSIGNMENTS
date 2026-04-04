import java.util.Scanner;
public class perfect_num{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number to check whether it is a perfect or not");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0&&n!=i)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
            System.out.println("entered number is a perfect number");
        else
            System.out.println("entered number is not a perfect number");

        sc.close();
    }
}
